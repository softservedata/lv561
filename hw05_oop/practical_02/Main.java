package practical_02;

public class Main {
	public static void main(String[] args) {
		
		Person[] people = {new Student(), new Teacher(), new Cleaner()};
		for (Person p : people) {
			p.print();
		}
	}
}

abstract class Person {
	String name;

	abstract void print();
}

abstract class Staff extends Person {
	
	abstract void salary();
}

class Student extends Person {
	final String TYPE_PERSON = "Student";

	@Override
	void print() {
		System.out.println("I am a " + TYPE_PERSON + ". ");
	}
}

class Teacher extends Staff {
	final String TYPE_PERSON = "Teacher";
	
	@Override
	void print() {
		System.out.print("I am a " + TYPE_PERSON + ". ");
		salary();
	}

	@Override
	void salary() {
		System.out.println("My salary: 5 000 $");	
	}	
}

class Cleaner extends Staff {
	final String TYPE_PERSON = "Cleaner";
	
	@Override
	void print() {
		System.out.print("I am a " + TYPE_PERSON + ". ");
		salary();
	}
	
	@Override
	void salary() {
		System.out.println("My salary: 2 000 $");		
	}
	
}