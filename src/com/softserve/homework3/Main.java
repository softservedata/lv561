package com.softserve.homework3;
import java.util.Scanner;
/*-
    Ask user to enter the number of month.
    Read the value and write the amount of days in this month (create array with amount days of each month).
    Enter 10 integer numbers.
    Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
    Enter 5 integer numbers. Find position of second positive number;
    minimum and its position in the array.
    Organize entering integers until the first negative number. Count the product of all entered even numbers.
    Create class Car with fields type, year of production and engine capacity.
    Create and initialize four instances of class Car. Display cars
    certain model year  (enter year in the console);
    ordered by the field year.
*/


public class Main {
    public static void main(String []args){

    }


    public static class Month {

        private void month() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of month: " + sc.nextInt());
                switch (sc.nextInt()) {
                    case 1: System.out.println("January");     break;
                    case 2:  System.out.println("February");    break;
                    case 3:  System.out.println("March");       break;
                    case 4:  System.out.println("April");       break;
                    case 5:  System.out.println("May");         break;
                    case 6:  System.out.println("June");        break;
                    case 7:  System.out.println("July");        break;
                    case 8:  System.out.println("August");      break;
                    case 9:  System.out.println("September");   break;
                    case 10:  System.out.println("October");     break;
                    case 11: System.out.println("November");    break;
                    case 12: System.out.println("December");    break;
                    default: System.out.println("Enter for 1 to 12");
                }
            }


        }
    }


