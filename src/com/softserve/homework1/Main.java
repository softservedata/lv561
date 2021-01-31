package com.softserve.homework1;

public class Main {
    Person firstPerson() = new Person(System.in);
    Person secondPerson() = new Person();
    Person thirdPerson() = new Person();
    Person fourthPerson() = new Person();
    Person fifthPerson() = new Person();

}
 class Person{
    private String firstName;
    private String lastName;
    private int birthYear;

     public String getFirstName() {
         return firstName;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public int getBirthYear() {
         return birthYear;
     }

     public void setBirthYear(int birthYear) {
         this.birthYear = birthYear;
     }

     public Person(){

     }
     public Person( String firstName, String lastName){
         this.firstName = firstName;
         this.lastName = lastName;

     }
     int getAge(){
         return 2021 - birthYear;
     }
     String input(){

     }
     String output(){

     }
     changeName(String fn, String In){

     }


 }
