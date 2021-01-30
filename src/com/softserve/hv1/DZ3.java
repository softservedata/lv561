package com.softserve.hv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ3 {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter units per minute for 3 countries");
		float c1 = Float.parseFloat(br.readLine());
		float c2 = Float.parseFloat(br.readLine());
		float c3 = Float.parseFloat(br.readLine());
		System.out.println("Enter call duration for 3 calls in seconds");
		int t1 = Integer.parseInt(br.readLine());
		int t2 = Integer.parseInt(br.readLine());
		int t3 = Integer.parseInt(br.readLine());
		float p1 = (float) (c1 * t1);
		float p2 = (float) (c2 * t2);
		float p3 = (float) (c3 * t3);
		System.out.println("Price of the 1th call = " + p1 + ", price of the 2nd call = " + p2 + ", price of the 3rd call = " + p3);
		System.out.println("Total price is " + (p1 + p2 + p3));
		
	}
}
