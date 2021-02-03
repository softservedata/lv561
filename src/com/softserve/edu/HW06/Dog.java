package com.softserve.edu.HW06;

/*-
 * 
 * 	Ñreate class Dog with fields name, breed, age. 
		Declare enum for field breed. 
		Create 3 instances of type Dog. 
		Check if there is no two dogs with the same name. 
	Display the name and the kind of the oldest dog. 

 * 
 * @author Taras krasitskyi
 *
 */
enum Breed {
	AKITA("Akita"), BEAGLE("Beagle"), CANAANDOG("Canaan Dog"), DALMATIAN("Dalmatian"), ENGLISHSETTER("English Setter"),
	NOBREED("NoBreed");

	private String name;

	private Breed(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}

public class Dog {
	private String name;
	private Breed breed;
	private int age;

	private Dog() {
		name = "NoName";
		age = 0;
		this.breed = Breed.NOBREED;

	}

	private Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = Breed.valueOf(breed.toUpperCase());
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed.toString();
	}

	public void setBreed(String breed) {
		this.breed = Breed.valueOf(breed.toUpperCase());
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		Dog dg1 = new Dog("Rex", "Beagle", 2);
		Dog dg2 = new Dog("Jack", "EnglishSetter", 15);
		Dog dg3 = new Dog("Rex", "Akita", 10);
		Dog dg4 = new Dog();
		System.out.println(dg1);
		System.out.println(dg2);
		System.out.println(dg3);
		System.out.println(dg4);
		// ----------------------------------------------------------
		// boolean check = false;
		if ((dg1.getName()).equals(dg2.getName()) || (dg1.getName()).equals(dg3.getName())
				|| (dg1.getName()).equals(dg3.getName())) {
			// check = true;
			System.out.println("Two or more dogs have same name!");
		} else
			System.out.println("All dogs have diferent name!");
		// ---------------------------------------------------------

		int max = dg1.getAge();
		String mname = dg1.getName();
		String br = dg1.getBreed();
		if (max < dg2.getAge()) {
			max = dg2.getAge();
			mname = dg2.getName();
			br = dg2.getBreed();

		}
		if (max < dg3.getAge()) {
			max = dg3.getAge();
			mname = dg3.getName();
			br = dg3.getBreed();

		}

		System.out.println(br + " " + mname + " is a oldest dog");

	}

}
