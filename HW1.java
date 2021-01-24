package com.company;

import java.util.Scanner;
public class Main {
        public static void main(String[] args){
        /*Flower bed is shaped like a circle.
        Calculate the perimeter and area by entering the radius.
        Output obtained results.
         */
        Scanner sc=new Scanner(System.in);

        System.out.println("Введіть периметр "+sc);
        int r=sc.nextInt();
        double per=2*Math.PI*r;
        double s=Math.PI*Math.pow(r,2);

        System.out.println("периметр = "+per);
        System.out.println("площа = "+s);

                /*Define String variables name and address.
                Output question "What is your name?"
                Read the value name and output next question:
                 “Where are you live, (name)?". Read address and write whole information.
                 */
        System.out.println("What is your name?");
        String name=sc.nextLine();
        System.out.println("Where are you live "+name+" ?");
        String address=sc.nextLine();

        System.out.println("Hello "+name+" from "+address);

/*Phone calls from three different countries are с1, с2 and с3 standard units per minute.
 Talks continued t1, t2 and t3 minutes.
 How much computer will count for each call separately and all talk together?
 Input all source data from console, make calculations and output to the screen.
 */
        }

        }






