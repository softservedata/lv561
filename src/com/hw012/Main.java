package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name, address;

        System.out.println("What is your name dear?");
        Scanner n = new Scanner(System.in);
        name = n.nextLine();

        System.out.println("Where do you live " + name + "?");
        Scanner a = new Scanner(System.in);
        address = a.nextLine();

        System.out.println("I know everything about you, your are " + name + " and you live in " + address + ".....");

    }
}
