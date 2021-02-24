package com.softserve.edu07.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyPerson {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Vernyhorov", "Yurii");
        map.put("Vernihorov", "Sergiy");
        map.put("Matskiv", "Petro");
        map.put("Vishchak", "Oleg");
        map.put("Sogor", "Maria");
        map.put("Slota", "Yurii");
        map.put("Popyk", "Vasyl");
        map.put("Kadylo", "Ivan");
        map.put("Glova", "Igor");
        map.put("Petrenko", "Vasyl");

        List<String> listValues = new ArrayList<>();

        System.out.println(map);

        for (Map.Entry<String, String> pair : map.entrySet()) { // creating the list of firstNames
            listValues.add(pair.getValue());
        }
        List<String> valuesCopies = new ArrayList<>();


        for (int i = 0; i < listValues.size()-1; i++) {     //recording firstnames in Array if the firstNames equals
            for (int j = i+1; j< listValues.size(); j++ ) {
                if (listValues.get(i).equals(listValues.get(j))) {
                    valuesCopies.add(listValues.get(i));
                }
            }
        }
        if (valuesCopies.size() > 0) {
            System.out.println("There exist one or more the same firstName");
        } else {
            System.out.println("There no doubled firstName");
        }
        String nameToDelete = "Maria";      // here we determine that name should be deleted;

        Map<String, String> mapCopy = new HashMap<>(map);

        for (Map.Entry<String, String> pair : mapCopy.entrySet()) {
            String firstName = pair.getValue();
            if (firstName.equals(nameToDelete)) {
                map.remove(pair.getKey());
            }
        }

        System.out.println(map);

    }
}
