package com.noirix.io;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class TextIOTask {

    public static final String READ_CONTENT_FILE = "read_text.txt";
    public static final String WRITE_CONTENT_FILE = "output_text.txt";

    public static void main(String[] args) {
        //1. Read from file read.txt
        //2. Process string and make it in UPPER CASE format
        //3. Write result string to output.txt

        int bufferSize = writeTestDataToFile();

        readProcessAndReWriteToFile(bufferSize);
    }

    public static void process() {
        int bufferSize = writeTestDataToFile();

        readProcessAndReWriteToFile(bufferSize);
    }

    public static int writeTestDataToFile() {
        String usersText = RandomStringUtils.randomAlphabetic(10);

        try (Writer writer = new FileWriter(READ_CONTENT_FILE)) {
            writer.write(usersText);
        } catch (IOException e) {
            System.err.println();
            throw new RuntimeException(e);
        }

        return usersText.length();
    }

    public static void readProcessAndReWriteToFile(int bufferSize) {
        try (Reader reader = new FileReader(READ_CONTENT_FILE);
             Writer writer = new FileWriter(WRITE_CONTENT_FILE)) {

            /*Read file*/
            char[] buffer = new char[bufferSize];
            int read = reader.read(buffer);
            System.out.println("Size of file is: " + read + " bytes");

            /*Process content*/
            String content = new String(buffer);
            String updatedContent = content.toLowerCase();

            /*Write updated content to file*/
            writer.write(updatedContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
