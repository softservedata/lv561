package com.softserve.six;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Person {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Ivanov", "Andry");
        personMap.put("Petrov", "Ad");
        personMap.put("Kirov", "Dred");
        personMap.put("Sidorov", "Dred");
        personMap.put("Koval", "Ded");
        personMap.put("Grachev", "Fed");
        personMap.put("Golovan", "Afan");
        personMap.put("Ljashko", "Afen");
        personMap.put("Maskov", "Adi");
        personMap.put("Marshakov", "Ady");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            String st = entry.getValue();
            for (Map.Entry<String, String> ent : personMap.entrySet()) {
                if ((ent.getValue().equals(st)) && (ent.getKey() != entry.getKey())) {
                    System.out.println(ent.getKey() + " and " + entry.getKey() + " have same names");
                }
            }
        }
        for (Iterator<Map.Entry<String, String>> i = personMap.entrySet().iterator(); i.hasNext();){
            Map.Entry entry =  i.next();
            if (entry.getValue().equals("Ady")) i.remove();
        }
        System.out.println("");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
