package com.noirix.exception;

import com.noirix.domain.User;

import java.io.FileInputStream;

public class ExceptionTest {
    public static void main(String[] args) {

        /*try with resources automatically close object and invoke close method on it*/
        try (FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            /*Потенциальная аварийная ситуация, опасный код,
            выполнение которого может вызвать ошибку и остановку приложения*/
            System.out.println("We are in try section");

            int read = fileInputStream.read();

            try {
                try {
                    try {
                        try {
                            throw new RuntimeException();
                        } catch (Exception e) {
                            throw new RuntimeException();
                        }
                    } catch (Exception e) {
                        throw new RuntimeException();
                    }
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
            }

            User user = new User();
            user.process();

            //throw new Throwable();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {

            System.out.println("we are catching some specific exceptions");

        } catch (RuntimeException e) {

            System.out.println("Runtime exception handling");

        } catch (Exception e) {

            System.out.println("Exception handling");

        } catch (Throwable e) {
            //e.printStackTrace();
            /*Обработка аварийной ситуации*/
            System.out.println("We catch Throwable");
            System.out.println(e.getMessage());

        } finally {
            /*Секция кода, которая выполнится независимо от того, произошла аварийная ситуация или же нет*/
            System.out.println("We are in finally block");
            throw new RuntimeException();
        }


        /*try - finally
         * try - catch -finally
         * try - catch*/
    }
}
