package com.softserve.edu.HW05;
/*
 * Example from presentation;
 */

public class Student {
	private String name;
	int rating;
	private static int number = 0;
	private static int sum = 0;

	public Student() {
		number++;
	}

	public Student(String name) {
		this.name = name;
		number++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
		sum += rating;
	}

	public static double getAvgRating() {
		return (double) sum / number;
	}

	public boolean betterStudent(Student student) {
		return this.getRating() > student.getRating();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rating=" + rating + "]";
	}

	public static void main(String[] args) {
		Student student1 = new Student("Oleg");
		student1.setRating(4);
		Student student2 = new Student("Anna");
		student2.setRating(5);
		Student student3 = new Student();
		student3.setName("Mary");
		student3.setRating(4);
		System.out.println("Out students");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println();
		System.out.print("Student 1 has better rating than student2 ");
		System.out.println(student1.betterStudent(student2));
		System.out.println();
		System.out.printf("Average rating is " + "%.2f", Student.getAvgRating());// "%.2f" - 2 digits after point??? 
	}

}
