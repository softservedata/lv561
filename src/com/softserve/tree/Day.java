package com.softserve.tree;


import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the day of the week - ");
        int a = sc.nextInt();

        switch (a) {
            case 1: {
                System.out.println("Monday, Понедельник");
                break;
            }
            case 2: {
                System.out.println("Tuesday, Вторник");
                break;
            }
            case 3: {
                System.out.println("Wednesday, Среда");
                break;
            }
            case 4: {
                System.out.println("Thursday, Четверг");
                break;
            }
            case 5: {
                System.out.println("Friday, Пятница");
                break;
            }
            case 6: {
                System.out.println("Saturday, Суббота");
                break;
            }
            case 7: {
                System.out.println("Sunday, Воскресенье");
                break;
            }
            default:
                System.out.println("Invalid number");
                System.exit(0);
        }
        sc.close();

    }
}
