package com.percifalll._09_collections.homework;

import java.util.*;

/**
 * Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
 * Output the entities of the map on the screen.
 * There are at less two persons with the same firstName among these 10 people?
 * Remove from the map person whose firstName is ”Orest” (or other). Print result.
 */

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Areds", "Ivan");
        personMap.put("Gwecs", "Petro");
        personMap.put("Dkfwf", "Lesya");
        personMap.put("Scxdwe", "Ivan");
        personMap.put("Xsvewd", "Vasya");

        personMap.put("Gswed", "Nastya");
        personMap.put("Vdwhf", "Dimon");
        personMap.put("Ibgdsf", "Orest");
        personMap.put("Bgmres", "Sofia");
        personMap.put("Mgrewq", "Roman");

        for (Map.Entry<String, String> entry : personMap.entrySet()){
            System.out.println(entry.getKey() + " \t\t" + entry.getValue());
        }

        Set<String> sameValues = getSameValues(personMap);
        System.out.println("In \"personMap\" exist " + sameValues.size() + " first name(s) that repeats");

        deleteByFirstName(personMap, "Orest");

        for (Map.Entry<String, String> entry : personMap.entrySet()){
            System.out.println(entry.getKey() + " \t\t" + entry.getValue());
        }
    }

    public static Set<String> getSameValues(Map<String, String> map){
        Set<String> result = new HashSet<>();

        for (Map.Entry<String, String> entry : map.entrySet()){
            for (Map.Entry<String, String> entry2 : map.entrySet()){
                if( (entry.getValue().equals(entry2.getValue()) ) &&
                        ( !entry.getKey().equals(entry2.getKey()) )
                ){
                    String toPut = entry.getValue();
                    result.add(toPut);
                }
            }
        }

        return result;
    }

    public static void deleteByFirstName(Map<String, String> map, String firstName){
        loop : for (Iterator i = map.entrySet().iterator(); i.hasNext();){
            Map.Entry entry = (Map.Entry) i.next();

            String value = (String) entry.getValue();
            if (value.equals(firstName)){
                i.remove();
                break loop;
            }
        }
    }
}
