package practical_01;

public class Main {	
	public static void main(String[] args) {
		
		Animal[] animals = {new Cat(), new Dog()};
		for(Animal a : animals) {
			a.voice();
			a.feed();
		}
		
	}
}


interface Animal {
	public void voice();
	public void feed();
}

class Cat implements Animal {

	@Override
	public void voice() {
		System.out.print("Meow-meow...");
		
	}

	@Override
	public void feed() {
		System.out.println("Whiskas, yummy!");
		
	}
	
}

class Dog implements Animal {

	@Override
	public void voice() {
		System.out.print("Woof-woof...");
		
	}

	@Override
	public void feed() {
		System.out.println("Pedigree, yummy!");
		
	}
	
}
