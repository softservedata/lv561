package com.softserve.five.Person;

public class MainPer {
    public static void main(String[] args) {

        Person p1 = new Teacher("Kolya");
        Person p2 = new Student("Vova");
        Person p3 = new Cleaner("Anton");
        Person p4 = new Teacher("Vasya");
        Person p5 = new Student("Vitya");
        Person p6 = new Student("Roma");
        Person[] arr =new Person[] {p1, p2, p3, p4, p5, p6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getName()+": ");
            arr[i].print();
            if ((arr[i] instanceof Teacher) || (arr[i] instanceof Cleaner)) {
                System.out.println(arr[i].getName() +"'s salary - "+((Staff) arr[i]).Salary());
            }
        }
    }
}
