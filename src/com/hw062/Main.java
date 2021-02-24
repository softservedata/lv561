package com.hw062;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();

        employeeMap.put(0, "Vasyl");
        employeeMap.put(1, "Vovka");
        employeeMap.put(2, "Valik");
        employeeMap.put(3, "Sanya");
        employeeMap.put(4, "Maks");
        employeeMap.put(5, "Andrey");
        employeeMap.put(6, "Ivan");

        System.out.println(employeeMap);

        Scanner scr = new Scanner(System.in);
        System.out.print("Please, enter ID of employee (0-6): ");
        int id = scr.nextInt();

        if (employeeMap.containsKey(id)) {
            System.out.println("His name - " + employeeMap.get(id));
        } else {
            System.out.print("You wrote uncorrect number");
        }

//        ----------------------------------------------------------------------------------------------------------------

        Scanner scra = new Scanner(System.in);
        System.out.print("Please, enter the name of employee: ");
        String name = scra.nextLine();

        Iterator<Map.Entry<Integer, String>> iterator = employeeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> jopa = iterator.next();
            String names = (jopa.getValue());
            if (employeeMap.containsValue(name)) {
                if (name.equals(names)) {
                    System.out.println("His ID - " + jopa.getKey());
                }
            } else {
                System.out.println("You wrote uncorrect name");
                break;
            }
        }
    }
}
