package com.homework7.past1;
import java.util.*;

public class PersonMap {
    public static void main(String[] args) {
        /*
        Create map personMap and add to it ten persons of type <String, String>
        (lastName, firstName). Output the entities of the map on the screen.
         */

        Map<String, String> personMap = new HashMap();
        personMap.put("Gogol", "Vitalii");
        personMap.put("Shatski", "Volodymyr");
        personMap.put("Sytnyk", "Dmytro");
        personMap.put("Stiven", "Dmytro");
        personMap.put("Marko", "Orest");
        personMap.put("Draginich", "Igor");
        personMap.put("Minkina", "Svitlana");
        personMap.put("Shostyr", "Iryna");
        personMap.put("Ilnets", "Stenli");
        personMap.put("Shato", "Anna");

        System.out.println("Print name toString: "
                + personMap + "\n_____________________________");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // There are at less two persons with the same firstName among these 10 people?
        List<String> firstName = new ArrayList<>(personMap.values());
        Set<String> names = new HashSet<>();
        for (int i = 0; i < firstName.size() - 1; i++) {
            for (int j = i + 1; j < firstName.size(); j++) {
                if (firstName.get(i).equals(firstName.get(j))) {
                    names.add(firstName.get(i));
                }
            }
        }

        System.out.println("-------------------------------------"
                + "\ntwo persons with the same firstName among 10 people");
        for (String name : names)
            for (Map.Entry<String, String> entry : personMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
            }
        System.out.println("-------------------------------------");


        //Remove from the map person whose firstName is ”Orest” (or other). Print result.

        for (Iterator<Map.Entry<String, String>> it = personMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> element = it.next();
            if (element.getValue().equals("Orest")) {
                it.remove();
            }
        }
        System.out.println("Remove from the map person whose firstName is ”Orest”");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " +  entry.getValue());
        }
    }
}







