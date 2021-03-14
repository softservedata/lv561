package com.softserve.edu8.String;

public class Space {
    public static void main(String[] args) {
        String sentence = "I    am      learning     Java   Core";
        System.out.println(spacing(sentence));
    }

    public static String spacing(String string) {
        String toReturn = string.trim().replaceAll("\\s++", " ");
        return toReturn;
    }


}
