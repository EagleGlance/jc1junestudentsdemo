package com.noirix.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOOperationsTest {
    public static void main(String[] args) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter("text.txt");

            bufferedWriter = new BufferedWriter(fileWriter);

            printWriter = new PrintWriter(bufferedWriter);

            //printWriter.write("Our first write operation!");

            //EOF -1
            printWriter.print("Our first write operation!!");

        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            printWriter.close();
        }
    }
}
