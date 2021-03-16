package com.percifalll._13_java8;

import java.util.stream.Collectors;

/**
 * Create two methods String encrypt(String s, int n)
 * and String decrypt(Stirng s, int n)
 *
 * Method encrypt should take a string and return coded string where every letter
 * is moved on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“).
 * Method decrypt should return decoded value
 */
public class Task2 {
    public static void main(String[] args) {
        String string = "abc";
        int position = 3;
        String encrypted = encrypt(string, position);
        String decrypted = decrypt(encrypted, position);

        System.out.printf(
                "String : %s\nEncrypted : %s\nDecrypted : %s\n",
                string, encrypted, decrypted
        );
    }

    public static String encrypt(String string, int num) {
        return string
                .chars()
                .map(a -> a + num)
                .mapToObj(c -> (char) c)
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    public static String decrypt(String string, int num){
        return string
                .chars()
                .map(a -> a - num)
                .mapToObj(c -> (char) c)
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
