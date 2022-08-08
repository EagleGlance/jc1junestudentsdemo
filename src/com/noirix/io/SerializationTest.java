package com.noirix.io;

import com.noirix.domain.Cat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
    public static void main(String[] args) throws IOException {


        Cat cat = new Cat(1L, "Slava", "type", 8D, "breed", "white", 5);
        System.out.println("Before serialization: ");
        System.out.println(cat);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(cat);

        byte[] serializedCat = byteArrayOutputStream.toByteArray();
        for (byte b : serializedCat) {
            System.out.print(b);
        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedCat);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        try {
            Object o = objectInputStream.readObject();

            if (o instanceof Cat) {
                Cat deserializedCat = (Cat) o;
                System.out.println("Deserialized cat:");
                System.out.println(deserializedCat);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
