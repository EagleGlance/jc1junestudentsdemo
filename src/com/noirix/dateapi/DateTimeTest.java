package com.noirix.dateapi;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Set;

public class DateTimeTest {
    private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //2022-08-22

        Timestamp timestamp = new Timestamp(new Date().getTime());
        System.out.println(timestamp);
        System.out.println(new Date().getTime());
        //2022-08-22 18:51:47.095 + nanos

        System.out.println(System.currentTimeMillis());

        LocalDate localDate = LocalDate.now(); //UTC +3
        LocalDate of = LocalDate.of(0, 7, 20);
        LocalDate parse = LocalDate.parse("08 07 1996", DateTimeFormatter.ofPattern("dd MM yyyy"));

        System.out.println(of.getEra());

        System.out.println(localDate);
        System.out.println(parse);
        System.out.println(parse.getChronology());
        System.out.println(parse.getEra());
        System.out.println(parse.getMonth());
        System.out.println(parse.getDayOfWeek());
        System.out.println(parse.getYear());
        System.out.println(parse.getDayOfMonth());
        System.out.println(parse.getMonthValue());

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

        System.out.println(now.plusYears(10).plusWeeks(14).minusHours(10).plus(10, ChronoUnit.SECONDS));


        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            if (availableZoneId.contains("York")) {

                System.out.println(availableZoneId);
                System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of(availableZoneId)));
                System.out.println(OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("+3")));
                System.out.println(LocalDateTime.now().atZone(ZoneOffset.of("-4")));
            }
        }


        String dateInString = "22-1-2015 10:15:55 AM";
        LocalDateTime ldt = LocalDateTime.parse(dateInString, DateTimeFormatter.ofPattern(DATE_FORMAT));

        ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
        System.out.println("TimeZone : " + singaporeZoneId);

        //LocalDateTime + ZoneId = ZonedDateTime
        ZonedDateTime asiaZonedDateTime = ldt.atZone(singaporeZoneId);
        System.out.println("Date (Singapore) : " + asiaZonedDateTime);

        ZoneId newYokZoneId = ZoneId.of("America/New_York");
        System.out.println("TimeZone : " + newYokZoneId);

        ZonedDateTime nyDateTime = asiaZonedDateTime.withZoneSameInstant(newYokZoneId);
        System.out.println("Date (New York) : " + nyDateTime);

        DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
        System.out.println("\n---DateTimeFormatter---");
        System.out.println("Date (Singapore) : " + format.format(asiaZonedDateTime));
        System.out.println("Date (New York) : " + format.format(nyDateTime));
    }
}
