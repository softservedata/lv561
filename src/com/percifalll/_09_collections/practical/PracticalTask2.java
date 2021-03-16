package com.percifalll._09_collections.practical;

import java.util.HashMap;
import java.util.Map;

public class PracticalTask2 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1, "aysfdb");
        employeeMap.put(2, "serdg");
        employeeMap.put(3, "asdvqwe");
        employeeMap.put(4, "dshytd");
        employeeMap.put(5, "zxcvhdgf");
        employeeMap.put(6, "treycv");
        employeeMap.put(7, "tyru4");

        printMap(employeeMap);
        System.out.println("\t***");

        int id = 0;
        System.out.println("Employee name by ID[" + id + "] = " + getNameById(employeeMap, id));
        System.out.println("\t***");

        String name = "treycv";
        System.out.println("Employee ID by name\"" + name + "\" = " + getIdByName(employeeMap, name));
    }

    public static void printMap(Map<Integer, String> map){
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static String getNameById(Map<Integer, String> map, int id){
        if(map.containsKey(id))
            return map.get(id);
        return null;
    }

    public static Integer getIdByName(Map<Integer, String> map, String value){
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if(entry.getValue().equals(value)) return entry.getKey();
        }
        return null;
    }
}
