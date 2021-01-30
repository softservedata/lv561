package com.softserve.edu.hv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ1 {

	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter radius of the bed in cm");
		float radius = Float.parseFloat(br.readLine());
		float perim = (float) (2 * 3.14 * radius);
		float square = (float) (3.14 * radius * radius);
		System.out.println("Perimeter of the bed = " + perim);
		System.out.println("Square of the bed" + square);
	}
}
