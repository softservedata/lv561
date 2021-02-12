package com.softserve.edu06.OOP.Person;

public class Appl {


    public static void main(String[] args) {
       Person student = new Student();
       Person teacher = new Teacher(15000.0);
       Person cleaner = new Cleaner(12000.0);
       Person student1 = new Student();
       Person teacher1 = new Teacher(21000.0);
       Person cleaner1 = new Cleaner(12000.0);

       Person[] array = new Person[] {student,student1, teacher,teacher1, cleaner, cleaner1};
       for (Person person : array) {
           person.print();
           if (person instanceof Teacher) {
               ((Staff) person).salary();
           } else if (person instanceof Cleaner) {
               ((Staff)person).salary();
           }
       }
    }
}
