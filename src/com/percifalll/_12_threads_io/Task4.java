package com.percifalll._12_threads_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Create file1.txt file with a text about your career.
 * Read context from file into array of strings. Each array item contains one line from file.
 * Write in to the file2.txt
 *    1) number of lines in file1.txt.
 *    2) the longest line in file1.txt.
 *    3) your name and birthday date.
 */

public class Task4 {
    public static void main(String[] args) {
        File file = new File("E:\\myCareer.txt");
        List<String> linesList = new LinkedList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                linesList.add(line);
                System.out.println(line);
            }

            String name = "";
            String dateOfBirth = "";

            Pattern nameRegex = Pattern.compile("(My name is |I am |I\'m |Name )(\\w+)");
            Pattern dateOfBirthRegex = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{4}");

            Matcher nameMatcher;
            Matcher dateMatcher;

            for (String row : linesList) {
                nameMatcher = nameRegex.matcher(row);
                dateMatcher = dateOfBirthRegex.matcher(row);

                if ((nameMatcher.find())
                        && (name.equals(""))) {
                    name = nameMatcher.group(2);
                }

                if ((dateMatcher.find())
                        && (dateOfBirth.equals(""))) {
                    dateOfBirth = dateMatcher.group();
                }
            }

            System.out.println("Name :" + name + "\n" +
                    "Date :" + dateOfBirth);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
