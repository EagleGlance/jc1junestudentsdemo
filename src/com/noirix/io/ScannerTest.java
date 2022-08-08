package com.noirix.io;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        boolean switcher = true;

        while (switcher) {
            printMenu();

            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();

            switch (i) {
                case 1:
                    IOTask.process();
                    break;
                case 2:
                    TextIOTask.process();
                    break;
                case 0:
                default:
                    switcher = false;
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Choose your option: ");
        System.out.println("Press 1 for IO operations with bytes");
        System.out.println("Press 2 for IO operations with chars");
        System.out.println("Press 0 to exit");
        System.out.print("Your choice: ");
    }
}
