package com.softserve.edu.HW09.Person;

/*-

 * Create next structure.
  In abstract class Person with property name, declare abstract method print().
  In other classes in body of method print() output text ‚Äú I am a ‚Ä ¶‚Äù.
  In class Staff declare abstract method salary().
  In each concrete class create constant TYPE_PERSON.
  Output type of person in each constructors.
  Create array of Person and add some Teachers, Cleaners and Students to it.
  Call method print() for all of it.
  Call method salary() for all Teachers and Cleaner

 */

public abstract class Person {
    private String name;
    
    public abstract void print();
    public abstract String getTypePerson();
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    

}
