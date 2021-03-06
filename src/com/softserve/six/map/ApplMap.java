package com.softserve.six.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class ApplMap {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new TreeMap<>();
        employeeMap.put(1, "Max");
        employeeMap.put(2, "Maks");
        employeeMap.put(3, "Macs");
        employeeMap.put(4, "Ma");
        employeeMap.put(5, "Mark");
        employeeMap.put(6, "Mak");
        employeeMap.put(7, "Mat");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID:" + entry.getKey() + " Name: " + entry.getValue());
        }
        //
        System.out.println("");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter ID - ");
        int id = 0;
        try {
            id = Integer.parseInt(rd.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (employeeMap.containsKey(id)) {
            System.out.println("ID:" + id + " Name: " + employeeMap.get(id));
        } else System.out.println("ID not found");

        //
        String nm = null;
        System.out.print("Enter Name - ");
        try {
            nm = rd.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (employeeMap.containsValue(nm)) {
            for (Map.Entry<Integer, String> ent : employeeMap.entrySet()){
                if (nm.equals(ent.getValue())) {
                    System.out.println("ID:" + ent.getKey() + " Name: " + ent.getValue());
                }

            }
        }else System.out.println("Name not found");

    }
}

