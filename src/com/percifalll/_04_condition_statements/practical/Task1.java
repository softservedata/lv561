package com.percifalll._04_condition_statements.practical;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers (separate them with single gap):\n");
        String numbersString = scanner.nextLine();

        String[] numbersTempArray = numbersString.split(" ");
        int[] numbersArray = new int[numbersTempArray.length];

        for (int i = 0 ; i < numbersTempArray.length; i++){
            numbersArray[i] = Integer.parseInt(numbersTempArray[i]);
        }

        System.out.printf("There is %d odd numbers\n", findOddNumbers(numbersArray));
        //System.out.println(Arrays.toString(numbersArray));
    }

    public static int findOddNumbers(int[] array){
        int result = 0;

        for (int item : array){
            if (item % 2 != 0) result++;
        }

        return result;
    }
}
