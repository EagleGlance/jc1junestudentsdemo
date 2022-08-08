package com.noirix.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesTest {
    public static void main(String[] args) throws IOException {

        Path readPath = Paths.get("text.txt");
        List<String> allLines = Files.readAllLines(readPath);

        Path writePath = Paths.get("text_output.txt");
        for (String allLine : allLines) {
            System.out.println(allLine);
            Files.write(
                    writePath,
                    allLine.toUpperCase().concat("\n").getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        }
    }
}
