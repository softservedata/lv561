package com.homework5;
import java.util.Scanner;

    /*Enter 10 integer numbers.
    Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
     */

public class Enter10Int {
    public static void main (String[] args){

                int[] arr = new int [10];
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter 10 Int: ");
                for (int i = 0; i < 10; i++) {
                   // System.out.print(sc.nextInt());
                    arr[i] += sc.nextInt();


                    int summ = 0;
                    int mult = 1;
                    for (int j = 0; j < 5; j++) {
                        if (arr[i] > 0) {
                            summ += arr[i];
                        } else {
                            for (int k = arr.length - 1; k >= 5; k--) {
                                mult *= arr[k];
                            }
                        }
                    }
                }
            }
        }


