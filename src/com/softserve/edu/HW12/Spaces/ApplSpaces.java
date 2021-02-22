package com.softserve.edu.HW12.Spaces;

import java.util.Scanner;

public class ApplSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        StringBuilder sb = new StringBuilder(sc.nextLine().trim());
        StringBuilder res = new StringBuilder ();
        Spaces ins = new Spaces();
        res = ins.removeSpaces(sb);
        System.out.println(sb);

    }
}
