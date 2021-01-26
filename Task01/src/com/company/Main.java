package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner live = new Scanner(System.in);

        System.out.println("Введіть своє імя");
        String you = name.nextLine();

        System.out.println("Де ви проживаэте " + you);
        String pers = live.nextLine();

        System.out.println(you + " Живе у " + pers);

    }
}
