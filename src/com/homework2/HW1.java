package com.homework2;
import java.util.Scanner;

class Home1 {

    public static void main(String[] args) {
        /*Flower bed is shaped like a circle.
        Calculate the perimeter and area by entering the radius.
        Output obtained results.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Write perimetr: ");
        int r = sc.nextInt();

        double per = 2 * Math.PI * r;
        double s = Math.PI * Math.pow(r, 2);

        System.out.println("perimetr = " + per);
        System.out.println("ploshcha = " + s);

                /*Define String variables name and address.
                Output question "What is your name?"
                Read the value name and output next question:
                 “Where are you live, (name)?". Read address and write whole information.
                 */
        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("Where do you live, " + name + "?");
        String address = sc.nextLine();

        System.out.println("Hello " + name + " from " + address);

/*Phone calls from three different countries are с1, с2 and с3 standard units per minute.
 Talks continued t1, t2 and t3 minutes.
 How much computer will count for each call separately and all talk together?
 Input all source data from console, make calculations and output to the screen.
 */
        int c1, c2, c3;
        int t1, t2,t3;
            System.out.println("Write parameter from first contry");
        c1 = sc.nextInt();
        t1 = sc.nextInt();
            System.out.println("c1 = " + c1 + " t1 = " + t1);
            System.out.println("Write parameter from second contry");
        c2 = sc.nextInt();
        t2 = sc.nextInt();
            System.out.println("c2 = " + c2 + " t2 = " + t2);
            System.out.println("Write parameter from third contry");
        c3 = sc.nextInt();
        t3 = sc.nextInt();
            System.out.println("c3 = " + c3 + " t3 = " + t3);

            int resultAll = c1 * t1 + c2 * t2 + c3 * t3;
            int resultFirst = c1 * t1;
            int resultSecond = c2 * t2;
            int resultThird = c3 * t3;

        System.out.println("Result for first = " + resultFirst);
        System.out.println("Result for second = " + resultSecond);
        System.out.println("Result for third = " + resultThird);
        System.out.println("Result for All = " + resultAll);
            }
        }






