package com.softserve.edu.HW07;

import java.util.Scanner;

public class Century {
	
	public static void main(String[] args) {
		System.out.print("Input year: ");
		Scanner sc = new Scanner(System.in);
		int year = Integer.parseInt(sc.nextLine());
		int century = year/100+1;
		System.out.println(year+" is "+century+" century");
		sc.close();
		
	}

}
