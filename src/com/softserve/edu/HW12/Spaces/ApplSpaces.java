package com.softserve.edu.HW12.Spaces;

import java.util.Scanner;

public class ApplSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        StringBuilder sb = new StringBuilder(sc.nextLine().trim());
        Spaces ins = new Spaces();
        int delete = 0;
        delete = ins.removeSpaces(sb);
        System.out.println("\tResult:\n "+sb);
        System.out.println("\tDeleted "+delete+" spaces.");
        sc.close();

    }
}
