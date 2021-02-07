package com.homework5;
import java.util.Scanner;

/*Enter 5 integer numbers. Find
        position of second positive number;
        minimum and its position in the array.
        Organize entering integers until the first negative number. Count the product of all entered even numbers.
*/

class Enter5Int {
    public static void main(String[] args) {
        int i = 0;
        int[] enter5 = new int[5];
        System.out.println("Enter 5 int: ");
        Scanner sc = new Scanner(System.in);
        int num = 0;

        //Find position of second positive number;
        for (; i < enter5.length; i++) {
            enter5[i] = sc.nextInt();
            if (enter5[i] > 0) {
                int ansPoz = enter5[i];

            }
            int min = enter5[0];
            if (enter5[i] < min) {
                enter5[i] = min;
            }
        }
        // Organize entering integers until the first negative number.
        for (int enter : enter5) {
            if (sc.nextInt() > 0) {
                continue;
            } else {
                break;
            }
        }
        //Count the product of all entered even numbers.
        for (int enter : enter5) {
            if (enter5[i] % 2 == 0) {
                num *= enter5[i];
                i++;
                continue;
            }
        }
    }
}


