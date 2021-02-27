package com.softserve.edu.HW13.PT1;

import java.util.Scanner;

public class ApplSquareRectangle {

	public static void main(String[] args) {

		SquareRectangle sr = new SquareRectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("\tEnter a: ");
		try {
			int a = Integer.parseInt(sc.nextLine());
			System.out.print("\tEnter b: ");
			int b = Integer.parseInt(sc.nextLine());
			int sq = sr.squareRectangle(a, b);
			System.out.println("squareRectangle: " + sq);
		} catch (NumberFormatException e) {
			System.out.println("ERROR! You must enter number!!!");

		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {sc.close();}

	}
}
