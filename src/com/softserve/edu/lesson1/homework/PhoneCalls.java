package com.softserv.javacore.homework;

import java.util.Scanner;

public class PhoneCalls {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter cost per minut in counry1 - ");
		double c1 = Double.parseDouble(sc.nextLine());
		System.out.print("Enter cost per minut in counry2 - ");
		double c2 = Double.parseDouble(sc.nextLine());
		System.out.print("Enter cost per minut in counry3 - ");
		double c3 = Double.parseDouble(sc.nextLine());
		System.out.print("Enter duration of phone talk1 - ");
		double t1 = Double.parseDouble(sc.nextLine());
		System.out.print("Enter duration of phone talk2 - ");
		double t2 = Double.parseDouble(sc.nextLine());
		System.out.print("Enter duration of phone talk3 - ");
		double t3 = Double.parseDouble(sc.nextLine());
		
		System.out.println("the cost of a phone call1 - "+(c1*t1));
		System.out.println("the cost of a phone call2 - "+(c2*t2));
		System.out.println("the cost of a phone call3 - "+(c3*t3));
		
		System.out.println("the cost of all phone call - "+( (c1*t1)+(c2*t2)+(c3*t3) ) );
		sc.close();
		
		
		
	}

}
