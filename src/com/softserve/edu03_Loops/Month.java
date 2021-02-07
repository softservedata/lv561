package com.softserve.edu03_Loops;

import java.io.IOException;
import java.util.Scanner;

public class Month {

    public static void main(String[] args) throws IOException {
        Scanner scanner  = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        if (!(monthNumber > 0) && !(monthNumber <= 12)) {
            throw new IOException("Entered wrong month number. Try again. Remember months number start from 1 and finished on 12");
        }

        int [] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] nameOfMonth = {"January", "Fbreuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("This month's name is "+nameOfMonth[monthNumber-1]+" and it has "+daysInMonth[monthNumber-1]+" days");

    }
}
