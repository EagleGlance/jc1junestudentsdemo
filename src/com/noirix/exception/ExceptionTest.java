package com.noirix.exception;

import com.noirix.domain.User;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.util.UUID;

public class ExceptionTest {

    private static final Logger log = Logger.getLogger(ExceptionTest.class);

    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();

        /*try with resources automatically close object and invoke close method on it*/
        try {
            /*Потенциальная аварийная ситуация, опасный код,
            выполнение которого может вызвать ошибку и остановку приложения*/
            log.info("We are in try section");

            try {
                try {
                    try {
                        try {
                            throw new RuntimeException();
                        } catch (Exception e) {
                            log.debug("asdfdsfsdfs");
                            throw new RuntimeException();
                        }
                    } catch (Exception e) {
                        throw new RuntimeException();
                    }
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                log.error("Exception id " + uuid, e);
            }

            User user = new User();
            user.process();

            //throw new Throwable();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            log.error("Exception id " + uuid, e);

        } catch (RuntimeException e) {

            log.error("Exception id " + uuid, e);

        } catch (Exception e) {

            log.error("Exception id " + uuid, e);

        } catch (Throwable e) {
            //e.printStackTrace();
            /*Обработка аварийной ситуации*/
            log.error("Exception id " + uuid, e);

        } finally {
            /*Секция кода, которая выполнится независимо от того, произошла аварийная ситуация или же нет*/
            log.info("We are in finally block " + ExceptionTest.class);
            throw new RuntimeException();
        }


        /*try - finally
         * try - catch -finally
         * try - catch*/
    }
}
