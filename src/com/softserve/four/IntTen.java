package com.softserve.four;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class IntTen {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int result = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Set " + (i + 1) + " number - ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i] >= 0) result += arr[i];
            else {
                result = 1;
                for (int j = 5; j < arr.length; j++) {
                    result *= arr[j];
                    System.out.print(result+ " ");
                }
                break;
            }
        }
        System.out.println(result);
    }
}

