package com.homework4.practical;

import java.util.Scanner;

/*
 * @author Vitalii Kryshtop
 * @version java 15.0
 *
 * 15.04.2021
 *
 */

/**
 * Enter the number of the day of the week. Display the name in three languages.
 */

public class PracticalTaskSecond {
    public static void main(String[] args) {
        System.out.println("Enter the number of the day of the week: ");
        Scanner sc = new Scanner(System.in);
        int enter = sc.nextInt();

        switch (enter) {         //Display the name in three languages
            case 1:
                System.out.println("Понеділок - Monday - Ponedzialek");
                break;
            case 2:
                System.out.println("Вівторок - Tuesday - Wtorek");
                break;
            case 3:
                System.out.println("Середа - Wednesday - Środa");
                break;
            case 4:
                System.out.println("Четвер - Thursday - Chwartek");
                break;
            case 5:
                System.out.println("П'ятниця - Friday - Piątek");
                break;
            case 6:
                System.out.println("Субота - Saturday - Sobota");
                break;
            case 7:
                System.out.println("Неділя - Sunday - Niedziela");
                break;
            default:
                System.out.println("Enter from 1 to 7");
        }
        sc.close();
    }
}
