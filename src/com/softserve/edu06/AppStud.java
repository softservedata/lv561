package com.softserve.edu06;

public class AppStud { // inherited Object by Default

	public static void main(String[] args) {
		Student st1 = new Student("Ivan", 23, "abc");
		Student st2 = new Student("Ivan", 23, "abc");
		System.out.println("(st1 == st2) = " + (st1 == st2) );
		System.out.println("st1.equals(st2) = " + st1.equals(st2));
		System.out.println("st1.hashCode() = " + st1.hashCode() );
		System.out.println("st2.hashCode() = " + st2.hashCode() );
	}
}
