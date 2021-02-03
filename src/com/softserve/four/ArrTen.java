package com.softserve.four;

public class ArrTen {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, -3, 6, -4, 12, 5, -19, 9, 0};
        int max=arr[0];
        int sum=0;
        int em=0;
        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]) max = arr[i];
            if (arr[i]<0) em +=1;
            if (arr[i]>=0) sum = sum + arr[i];
        }
        System.out.println(max);
        System.out.println(sum);
        System.out.println(em);
    }
}

