package com.softserve.edu.myexample;

interface A {
	public default void m1() {
		System.out.println("A");
		m2();
	}

	public default void m2() {
		System.out.println("A");
	}
}

interface B extends A {

	public default void m2() {
		System.out.println("B");
		((A)this).m2();
	}

}

class C implements B, A {
}

public class ExampleInterface1 {
	public static void main(String[] args) {
		A a = new C();
		a.m1();
	}
}
