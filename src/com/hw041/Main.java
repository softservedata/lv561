package com.hw041;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = 10, max;
        int[] arr = new int[n];

        arr[0] = 12;
        arr[1] = 1;
        arr[2] = 10;
        arr[3] = -2;
        arr[4] = 0;
        arr[5] = -4;
        arr[6] = -22;
        arr[7] = 7;
        arr[8] = -1;
        arr[9] = 38;
        max = arr[0];

        System.out.print("Array - ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n----------------------------");

        for (int l = 0; l < n; l++) {

            if (max < arr[l]) {
                max = arr[l];
            }
        }
        System.out.println("The biggest number - " + max);

        int posSum = 0;
        int posNum = 0;
        for (int j = 0; j < arr.length; j++){
            if (arr[j] >= 0){
                posSum += arr[j];
                posNum++;
            }
        }
        System.out.println("The sum of positive numbers - " + posSum);

        int negNum = 0;
        for (int y = 0; y < arr.length; y++){
            if (arr[y] < 0){
                negNum++;
            }
        }
        System.out.println("The amount of negative numbers - " + negNum);
        System.out.println("----------------------------");

        if (posNum > negNum){
            System.out.println("There are more positive numbers\nPositive - " + posNum + "\nNegative - " + negNum);
        }else if (negNum == posNum){
            System.out.println("There are equal number of positive and negative numbers\nPositive - " + posNum + "\nNegative - " + negNum);
        }else {
            System.out.println("There are more negative numbers\nPositive - " + posNum + "\nNegative - " + negNum);
        }
        System.out.println("----------------------------");
        System.out.println("----------------------------");

        Employee Jon = new Employee("Jon", 1,18000);
        Employee Max = new Employee("Max", 1,13000);
        Employee Robert = new Employee("Robert", 2,10000);
        Employee Leo = new Employee("Leo", 2,7000);
        Employee Vova = new Employee("Vova", 3,1000);

//      Як це оптимізувати??

        Scanner scr = new Scanner(System.in);
        int y = scr.nextInt();
        if (y == 1){
            Jon.print();
            Max.print();
        }else if (y == 2){
            Robert.print();
            Leo.print();
        }else if (y == 3){
            Vova.print();
        }
    }
}
