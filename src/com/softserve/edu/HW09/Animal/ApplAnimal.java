package com.softserve.edu.HW09.Animal;

public class ApplAnimal {

	public static void main(String[] args) {

		Animal ct1 = new Cat();
		Animal ct2 = new Cat();
		Animal ct3 = new Cat();
		Animal dg1 = new Dog();
		Animal dg2 = new Dog();
		Animal dg3 = new Dog();
		Animal[] anm = { ct1, dg1, ct2, dg2, dg3, ct3 };
		for (int i = 0; i < anm.length; i++) {
			anm[i].voice();
			System.out.print(" - ");
			anm[i].feed();
			System.out.print("\n");
			//System.out.println("");
		}

	}
}
