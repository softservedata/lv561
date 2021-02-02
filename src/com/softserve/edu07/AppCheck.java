package com.softserve.edu07;

public class AppCheck {
	public static void main(String[] args) {
		boolean bool = 2 > 5;
		System.out.println("bool = " + bool);
		if (bool = true) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		System.out.println("end bool = " + bool);
		boolean bool2 = true;
		System.out.println("bool &&  bool2 = " + (bool && bool2));
		byte b = 0x0D;  // 00001101
		byte b1 = 0x0A; // 00001010
		System.out.println("b &  b1 = " + (b & b1)); // 00001000 = 8
	}
}
