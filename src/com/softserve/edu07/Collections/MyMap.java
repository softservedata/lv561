package com.softserve.edu07.Collections;

import java.util.*;

public class MyMap {

    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Petrenko");
        employeeMap.put(2,"Lukianenko");
        employeeMap.put(3,"Kovalchuk");
        employeeMap.put(4, "Kononenko");
        employeeMap.put(5, "Zaycev");
        employeeMap.put(6, "Davydenko");
        employeeMap.put(7, "Selesenko");

        for (Map.Entry<Integer,String> pairs : employeeMap.entrySet()) {
            int key = pairs.getKey();
            String value = pairs.getValue();
            System.out.println(key+" : "+value);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key to get value: ");
        int key = scanner.nextInt();
        if (containsKey(key, employeeMap)) {
            System.out.println("Employee name is: "+employeeMap.get(key));
        } else {
            System.out.println("You entered non-valid ID");
        }



    }

    public static boolean containsKey(int key, Map<Integer,String> map) {
        boolean result = false;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer,String> pairs : map.entrySet()) {
            list.add(pairs.getKey());
        }
        for (Integer integer: list) {
            if (key == integer) {
                result = true;
            }
        }
        return result;
    }
}
