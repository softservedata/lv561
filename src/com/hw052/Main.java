package com.hw052;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Teacher("Ivan");
        Person p2 = new Cleaner("Slovak");
        Person p3 = new Student("Vanya");
        Person p4 = new Student("Lox");
        System.out.println("-----------");

        Person arr[] = new Person[4];

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;

        for (int i = 0; i < arr.length; i++){

            System.out.print(arr[i].getName() + ": ");
            arr[i].print();
            System.out.println("");

            if (arr[i] instanceof Teacher || arr[i] instanceof Cleaner){
                System.out.print("Salary - ");
                System.out.print(((Staff) arr[i]).salary());
                System.out.println("");
                System.out.println("-----------");

            }
        }
    }
}
