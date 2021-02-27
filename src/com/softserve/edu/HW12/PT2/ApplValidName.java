package com.softserve.edu.HW12.PT2;

import java.util.Scanner;

public class ApplValidName {

	public static void main(String[] args) {
		ValidName obj = new ValidName();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Please, enter the user name: ");
			obj.validName(sc.nextLine());

		}
		sc.close();

	}

}
