package com.softserve.edu05;

import java.util.Arrays;

class A {

	@Override
	public String toString() {
		return "Hello";
	}
	
}

public class Appl {
	private String name;

	// Overload
	public void print() {
		System.out.println("name = " + name);
	}

	// Overload
	public void print(String s) {
		System.out.println("s = " + s + " name = " + name);
	}

	public void print(String welcomeMessage, int k, Object... messages) {
		System.out.println("welcomeMessage = " + welcomeMessage);
		System.out.println("k = " + k);
		for (Object msg : messages) {
			System.out.println("\tmsg = " + msg); // msg.toString()
		}
	}

	public static void main(String[] args) {
		/*-
		int i = 100;
		long l = i; // no explicit type casting required
		System.out.println("l=" + l);
		float f = l;
		System.out.println("f=" + f);
		//
		double d = 101.04;
		System.out.println("d=" + d);
		l = (long) d; // explicit type casting required
		System.out.println("new l=" + l);
		i = (int) l;
		System.out.println("new i=" + i);
		*/
		//
		/*-
		Appl app = new Appl();
		app.name = "abc";
		app.print();
		app.print("aaaa");
		//
		app.print("welcom", 123, "abc", 555, "qwerty", new Double(1.5), new A(), true);
		app.print("welcom", 123);
		*/
		//
		Student st0 = new Student("Ivan", 21);
		Student st = new Student(23);
		System.out.println("name = " + st.getName());
		System.out.println("Count = " + st0.getCount());
		System.out.println("st0 = " + st0);  // st0.toString();
		System.out.println("st = " + st);
		//
		//Helper h = new Helper();
		//h.setMessage("PRIVATE"); // Architecture Error
		Helper.setMessage("PRIVATE");
		Helper.print();
		//
		//Arrays a;
	}
}
