package hw01_introduction;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {		
		/*
		 * Task 1. 
		 * Flower bed is shaped like a circle.
		 * Calculate the perimeter and area by entering the radius.
		 * Output obtained results. 
		 */
		
		System.out.println("Task 1.");
		
		double c, a, r = 5.0;		
		c = 2 * Math.PI * r;
		a = Math.PI * Math.pow(r, 2);
				
		System.out.println("\t > Perimeter: " + Math.round(c));
		System.out.println("\t > Area: " + Math.round(a));

		/* 
		 * Task 2. 
		 * Define String variables name and address.
		 * Output question "What is your name?"
		 * Read value of the name and output next question: "Where do you live?"
		 * Read address and write whole information.
		 */
		System.out.println("Task 2.");	
		
		System.out.print("What is your name? ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.print("Where do you live, " + name + "? ");
		String address = in.nextLine();
		
		System.out.println("\t> USER: " + name);
		System.out.println("\t> ADDRESS: " + address);
		
		/*
		 * Task 3. 
		 * Phone calls from three different countries are c1, c2, c3 standard units per minute.
		 * Talks continued t1, t2, and t3 minutes.
		 * How much computer will count for each call separately and all talk together?
		 * Input all source from console, make calculations and output to the screen.
		 */
		System.out.println("Task 3.");
		
		int[] array1 = new int[4];
		int[] array2 = new int[4];
		
		System.out.println("Enter standard units per minute for: ");		
		for(int i = 1; i < array1.length; i++) {
			System.out.print("\tcall No." + i + " > ");
			array1[i] = in.nextInt();
		}		
		System.out.println("Enter time for: ");		
		for(int j = 1; j < array2.length; j++) {
			System.out.print("\tcall No." + j + " > ");
			array2[j] = in.nextInt();
		}		
		in.close();
		
		int s1 = array1[1] * array2[1];
		int s2 = array1[2] * array2[2];
		int s3 = array1[3] * array2[3];
		int sum = s1 + s2 + s3;
		
		System.out.println("Call No.1 counts: " + s1);
		System.out.println("Call No.2 counts: " + s2);
		System.out.println("Call No.3 counts: " + s3);
		System.out.println("All talk counts: " + sum);
					
	}

}
