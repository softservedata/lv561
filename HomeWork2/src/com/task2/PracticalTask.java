package com.task2;

import java.util.Scanner;

public class PracticalTask {
    public static void main (String[] arg){
        Employee M0 = new Employee("Надія", 2,5);
        Employee M1 = new Employee("Максим", 5, 1);
        Employee M2 = new Employee("Маркіян", 3, 4);
// метод getSalary()
        System.out.println("salary for Надія " + M0.getSalary() + " грн");
        System.out.println("salary for Максим " + M1.getSalary() + " грн");
        System.out.println("salary for Маркіян " + M2.getSalary() + " грн");
// метод toString()
        System.out.println(M0.toString());
        System.out.println(M1.toString());
        System.out.println(M2.toString());
// метод changeRate(int rate)
       /* Scanner cR = new Scanner(System.in);
        System.out.println("Введіть новий rate:");
        int number = cR.nextInt();
        System.out.println();
        cR.close();
        */
// метод getBonuses()
        System.out.println("Bonuses for Надія " + M0.getBonuses() + " грн");
        System.out.println("Bonuses for Максим " + M1.getBonuses() + " грн");
        System.out.println("Bonuses for Маркіян " + M2.getBonuses() + " грн");

        System.out.println("Total salary " + (M0.getSalary() + M1.getSalary() + M2.getSalary()) + " грн");
    }
}
