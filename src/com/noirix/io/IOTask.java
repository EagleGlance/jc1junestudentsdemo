package com.noirix.io;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOTask {

    public static final String READ_CONTENT_FILE = "read_binary.txt";
    public static final String WRITE_CONTENT_FILE = "output_binary.txt";

    public static void main(String[] args) {
        //1. Read from file read.txt
        //2. Process string and make it in UPPER CASE format
        //3. Write result string to output.txt

        int bufferSize = writeTestDataToFile();

        readProcessAndReWriteToFile(bufferSize);
    }

    public static int writeTestDataToFile() {
        String usersText = RandomStringUtils.randomAlphabetic(10);

        try (FileOutputStream fileOutputStream = new FileOutputStream(READ_CONTENT_FILE)) {
            fileOutputStream.write(usersText.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return usersText.length();
    }

    public static void readProcessAndReWriteToFile(int bufferSize) {
        try (FileInputStream fileInputStream = new FileInputStream(READ_CONTENT_FILE);
             FileOutputStream fileOutputStream = new FileOutputStream(WRITE_CONTENT_FILE)) {

            /*Read file*/
            byte[] buffer = new byte[bufferSize];
            int read = fileInputStream.read(buffer);
            System.out.println("Size of file is: " + read + " bytes");

            /*Process content*/
            String content = new String(buffer);
            String updatedContent = content.toUpperCase();

            /*Write updated content to file*/
            fileOutputStream.write(updatedContent.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
