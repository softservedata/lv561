package com.softserve.edu07.Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        System.out.println("********************");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter key to get value: ");
        int key = 0;
        try {
            key = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (containsKey(key, employeeMap)) {
            System.out.println("Employee name is: "+employeeMap.get(key));
        } else {
            System.out.println("You entered non-valid ID");
        }


        System.out.print("Enter employee name: ");
        String value = null;
        try {
            value = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (containsValue(value, employeeMap)) {
            for (Map.Entry<Integer,String> pair : employeeMap.entrySet()) {
                String surname = pair.getValue();
                if (value.equals(surname)) {
                    System.out.println("Employee's id: "+pair.getKey());
                }
            }
        } else {
            System.out.println("You entered unexisted surname");
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

    public static boolean containsValue(String value, Map<Integer,String> map) {
        boolean result = false;
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer,String> pairs : map.entrySet()) {
            list.add(pairs.getValue());
        }
        for (String surname: list) {
            if (value.equals(surname)) {
                result = true;
            }
        }
        return result;
    }






}
