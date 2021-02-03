package hw03_conditional;

/*
 * Homework Task 2. 
 * Create class Dog with fields name, breed, age.
 * Declare enum for field breed.
 * Create 3 instances of type Dog.
 * Check if there are no dogs with the same name.
 * Display the name and the kind of the oldest dog. 
 */

enum Breed {
	BULLDOG, POODLE, LABRADOR, CHIHUAHUA, ROTTWEILER;
}

public class Dog {
	private String name;
	private Breed breed;
	private int age;

	Dog() {}

	Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public boolean checkForSameName(Dog d1, Dog d2) {
		if (d1.getName().equals(d2.getName())) {
			System.out.println("Oops, there is another dog with the same name " + d1.name);
			return true;
		} else {
			System.out.println(d1.name + " has a unique name");
			return false;
		}
	}

	public void getOldestDog(Dog d1, Dog d2, Dog d3) {
		if (d1.getAge() >= d2.getAge() && d1.getAge() >= d3.getAge()) {
			System.out.println(d1.name + " - " + d1.breed + ", is the oldest dog");
		} else if (d2.getAge() >= d1.getAge() && d2.getAge() >= d3.getAge()) {
			System.out.println(d2.name + " - " + d2.breed + ", is the oldest dog");
		} else {
			System.out.println(d3.name + " - " + d3.breed + ", is the oldest dog");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		Dog d1 = new Dog("Cooper", Breed.LABRADOR, 3), 
			d2 = new Dog("Luna", Breed.CHIHUAHUA, 5),
			d3 = new Dog("Daisy", Breed.POODLE, 4);

		System.out.println(d1 + "\n" + d2 + "\n" + d3);

		d1.checkForSameName(d1, d2);
		d1.getOldestDog(d1, d2, d3);
	}

}
