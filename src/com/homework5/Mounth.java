package com.homework5;
import java.util.Scanner;

     /*
    Ask user to enter the number of month.
    Read the value and write the amount of days in this month (create array with amount days of each month).
    */

class Month {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int num = 0;
                boolean isValid = false;

                do{ System.out.print("Enter number of month from 1 to 12: ");
        try {
            num = sc.nextInt();
            isValid = true;
            switch (num) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Enter from 1 to 12");
            }
        } catch (Exception e){
                System.out.println("Error: invalid data, Please enter from 1 to 12");
            }

        }while (!isValid);
    }
        }



