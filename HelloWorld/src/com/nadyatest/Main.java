package com.nadyatest;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int a = 35;
    static int b = 20;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //task part1
        //Define integer variables a and b. Read values a and b from Console and calculate:
        //a + b
        //a - b
        //a * b
        //a / b.
        //Output obtained results

            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);

        //task part2
        // Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".
            System.out.println("How are you?");
            String answer = br.readLine();

            System.out.println("You are " + answer);

    }

}
