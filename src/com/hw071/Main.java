package com.hw071;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

       String sentence = "IT Academy";
       String search  = "IT";

       if (sentence.toLowerCase().contains(search.toLowerCase())) {
           System.out.println("True");
       } else {
           System.out.println("False");
       }

       Scanner scr = new Scanner(System.in);
       System.out.println("Enter yours surname, name and patronymic: ");
       String naming = scr.nextLine();

       int i = 0;
       String[] words = naming.split(" ");
       String[] finish = new String[3];
       for (String word : words) {
           if (i == 0){
               finish[i] = word;
               i++;
           }else if (i == 1){
               finish[i] = word;
               i++;
           }else if (i == 2){
               finish[i] = word;
           }
       }

       System.out.println("Surname and initials: " + finish[0] + " " + finish[1].substring(0, 1).toUpperCase(Locale.ROOT) + ". " + finish[2].substring(0, 1).toUpperCase(Locale.ROOT) + ". ");
       System.out.println("Name: " + finish[1]);
       System.out.println("Name, middle name and last name: " + finish[1] + " " + finish[2] + " " + finish[0]);
       System.out.println("----------------------------------------------------------------------------");

        String un0 = "Noname#$%^";
        String un1 = "Kaka";
        String un2 = "Taras";
        String un3 = "Ma";
        String un4 = "MishaMishaMishaa";

        String[] arr = new String[5];
        arr[0] = un0;
        arr[1] = un1;
        arr[2] = un2;
        arr[3] = un3;
        arr[4] = un4;

        String pattern = "[a-zA-z 1-9_]+";
        Pattern p = Pattern.compile(pattern);


        for (int k = 0; k < arr.length; k++) {

            int c = 0;
            System.out.println("Name - " + arr[k]);

            if (arr[k].length() < 3){
                System.out.println("    Name '" + arr[k] + "' is too short");
            }else {
                c++;
            }

            if (arr[k].length() > 15 ){
                System.out.println("    Name '" + arr[k] + "' is too long");
            }else {
                c++;
            }

            Matcher m = p.matcher(arr[k]);

            if (!m.matches()){
                System.out.println("    This name have some forbidden characters");
            }else {
                c++;
            }

            if (c == 3){
                System.out.println("    This name is completely fine!!!");
            }

            System.out.println("-------------------");
        }

    }
}
