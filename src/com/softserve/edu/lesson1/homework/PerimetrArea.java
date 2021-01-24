package com.softserve.edu.lesson1.homework;

import java.util.Scanner;
import java.lang.Math;

/**
 * 
 * @author Taras Krasitskyi
 * HomeWork_1
 * Calculate perimetr and area using pi=3.14 and r*r"
 * Calculate perimetr and area using method java.lang.Math Math.PI and Math.pow(a,b)
 * 
 *
 */
public class PerimetrArea {
	public static void main(String[] args) {
// Calculate perimetr and area using pi = 3.14
		double pi = 3.14;
		System.out.print("Input flower beds radius - ");
		Scanner sc = new Scanner(System.in);
		double r = Double.parseDouble(sc.nextLine());
		System.out.println("");
		System.out.println("Calculate perimetr and area using pi=3.14 and r*r");
		System.out.println("");
		System.out.println("Perimetr of the flower beds is " + 2 * pi * r);
		System.out.println("Area of the flower bed is " + pi * r * r);
		System.out.println();
//
// Calculate perimetr and area using method java.lang.Math;
		System.out.println("Calculate perimetr and area using method java.lang.Math Math.PI and Math.pow(a,b)");
		System.out.println("");
		System.out.println("Perimetr of the flower beds is " + 2 * Math.PI * r);
		System.out.println("Area of the flower bed is " + Math.PI * Math.pow(r, 2));
//		
		sc.close();

	}

}
