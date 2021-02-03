package hw04_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Task 4. Create class Car with fields type, year of production and engine capacity. 
 * Create and ititialize four instances of class Car. 
 * Display cars:
 * 	- certain model year (enter year in the console);
 *  - ordered by the field year.
 */

public class Car {
	private String type;
	private int yearOfProduction;
	private double engineCapacity;

	Car() {}

	Car(String type, int yearOfProduction, double engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}

	/*
	 * method to display cars of a certain model year, 
	 * enter year in console
	 */
	void displayCar(ArrayList<Car> cars) {
		System.out.print("Enter year: ");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		in.close();

		for (Car c : cars) {
			if (c.getYearOfProduction() == year) {
				System.out.println(c.toString());
			} 
		}

	}
	
	/*
	 * sorting cars by field: year of production
	 */

	static Comparator<Car> byYearOfProduction = new Comparator<Car>() {

		@Override
		public int compare(Car o1, Car o2) {
			int year1 = (int) o1.getYearOfProduction();
			int year2 = (int) o2.getYearOfProduction();
			return year2 - year1;
		}
	};

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProduction=" + yearOfProduction + ", engineCapacity=" + engineCapacity
				+ "]";
	}
	
	

	public static void main(String[] args) {

		Car c1 = new Car("suv", 2021, 2.0), 
			c2 = new Car("sedan", 2019, 1.6), 
			c3 = new Car("minivan", 2019, 5.3),
			c4 = new Car("sports car", 2020, 3.4);

		ArrayList<Car> cars = new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);

		Collections.sort(cars, Car.byYearOfProduction);
		for (Car c : cars) {
			System.out.println(c);
		}

		c1.displayCar(cars);

	}

}
