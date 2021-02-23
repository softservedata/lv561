package com.homework8.prackical;

import java.util.Scanner;

public class practical {
    public static void main(String[] args){
        /*Enter the two variables of type String. Determine whether the first variable substring second.
For example, if you typed «IT» and «IT Academy» you must receive true.*/

        String first = "Java";
        String second = "I'm learning Java Programing";
        System.out.println(second.contains(first) + "\n--------------------------------------");


        System.out.println("Enter surname, name and patronymic");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[ ] arr = input.split(" ");

        System.out.println(arr[0] + " " + arr[1].toUpperCase().substring(0, 1) + "." +
                arr[2].toUpperCase().substring(0, 1) + ".\n----------------------------");

        /*The user name can be 3 to 15 characters of the Latin alphabet,
numbers, and underscores. Using regular expressions implement checking the user name for validity.
Input five names in the main method.
Output a message to the console of the validation of each of the entered names.*/

        String[] names = {"King", "Lussi", "SimonFurkadMillow", "Teodor", "Kiril"};

        for(int i = 0; i < names.length; i++) {
            boolean validation = false;
            if (names[i].length() > 3 && names[i].length() < 15){
                validation = true;
        }else{validation = false;}
        System.out.println(names[i] + " = " + validation);
        }
    }
}
