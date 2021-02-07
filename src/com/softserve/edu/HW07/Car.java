package com.softserve.edu.HW07;

import java.util.Scanner;

/*-
 * Create class Car with fields
 *  type,
 *  year of production
 *  and engine capacity.
 *  Create and initialize four instances of class Car. Display cars
	certain model year  (enter year in the console);
	ordered by the field year.

 * 
 * @author Taras Krasitskyi
 *
 */
public class Car {
	private String name;
	private String model;
	private int year;
	private double capasity;

	private Car() {
		name = "NoName";
		model = "NoModel";
		year = 0;
		capasity = 0;
	}

	private Car(String name, String model, int year, double capasity) {
		this.name = name;
		this.model = model;
		this.year = year;
		this.capasity = capasity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getCapasity() {
		return capasity;
	}

	public void setCapasity(double capasity) {
		this.capasity = capasity;
	}

	@Override
	public String toString() {
		return "Car [name = " + name + ", model = " + model + ", year = " + year + ", capasity = " + capasity + "]";
	}

	public static void main(String[] args) {
		// Create and initialize four instances of class Car.
		Car c1 = new Car();
		c1.setName("Toyota");
		c1.setModel("Camry");
		c1.setYear(2020);
		c1.setCapasity(160);
		Car c2 = new Car("Mersedes-Benz", "G63", 2017, 220);
		Car c3 = new Car("Wolksvagen", "Passat", 2015, 150);
		Car c4 = new Car("Opel", "Astra", 2017, 130);

		System.out.println(c1.getName() + " " + c1.getModel() + " " + c1.getYear() + " " + c1.getCapasity());

		System.out.println("Array of Cars: ");
		Car[] cars = { c1, c2, c3, c4 };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		// Display cars certain model year (enter year in the console);

		System.out.print("Input model year: ");
		boolean isCars = false;
		Scanner sc = new Scanner(System.in);
		int year = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getYear() == year) {
				System.out.println(cars[i]);
				isCars = true;
			}
		}
		if (!isCars)
			System.out.println("No cars to display!!!");
		sc.close();
		
		// Ordered by the field year.
		System.out.println("Ordered by the field year.");
		Car tmp = new Car();
		boolean isSorted = true;
		for(int i = 0; i < cars.length-1;i++) {
			isSorted = true;
			//System.out.print("*");
			for(int j = 0; j < cars.length-1-i;j++) {
				if (cars[j].getYear() > cars[j+1].getYear()) {
					tmp = cars[j];
					cars[j]=cars[j+1];
					cars[j+1] = tmp;
					isSorted = false;
					//System.out.print(".");
				}
				
			}
			if(isSorted) {
				break;
				
			}
			
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
