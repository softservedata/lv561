package com.hw063;
import java.util.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> personMap = new HashMap<String, String>();

        personMap.put("Ivanov", "Ivan");
        personMap.put("Vysochanskyi", "Vovka");
        personMap.put("Kyba", "Vasyl");
        personMap.put("Popov", "Sanya");
        personMap.put("Veres", "Ivan");
        personMap.put("Marchuck", "Slavik");
        personMap.put("Rubak", "Slavik");
        personMap.put("Nutrebuch", "Maks");
        personMap.put("Ivasuk", "Dima");
        personMap.put("Prysak", "Taras");

        System.out.println(personMap);
        Iterator<Map.Entry<String, String >> iterator = personMap.entrySet().iterator();
        Set<String> values = new HashSet<>();
        for (Map.Entry<String, String> curr : personMap.entrySet()) {
            if (!values.add(curr.getValue())) {
                System.out.println(curr.getValue());
            }
        }

//        while (iterator.hasNext()) {
//            int k = 0;
//
//            Map.Entry<String, String > bbb = iterator.next();
//            String names = bbb.getValue();
//
//            Iterator<Map.Entry<String, String >> iterator1 = personMap.entrySet().iterator();
//            String naming;
//
//            while (iterator1.hasNext()){
//
//                Map.Entry<String, String > aaa = iterator1.next();
//                naming = aaa.getValue();
//                System.out.println("------------" + names);
//                System.out.println(naming);
//                if (names.equals(naming)){
////                    k++;
////                    if (k == 2){
//                        System.out.println("There are more than 2 people have same names - " + naming);
////                    }
//                }
////                System.out.println(k);
//            }
//
//            if (names.equals("Dima")){
//                iterator.remove();
//                System.out.println("We deleted " + names);
//            }
//        }
//
//        System.out.println(personMap);
    }
}
