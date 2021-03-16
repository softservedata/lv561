package com.percifalll._13_java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create method to validate date according to format "mm.dd.yy"
 */
public class Task3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM.dd.yy");

        String formattedDate = date.format(format);
        System.out.println(formattedDate);
        System.out.println(validateDate(formattedDate, SHORT_FORMAT_REGEX));
    }

    public static final String SHORT_FORMAT_REGEX = "(\\d\\d)\\.(\\d\\d)\\.(\\d\\d)";

    public static boolean validateDate(String date, String format){
        Pattern pattern = Pattern.compile(format);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
}
