package com.softserve.edu.HW10.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*-
 * 
 * 
 * Write class Student that provides information about the name of the student and his course.
 * Class Student should consist of
	properties for access to these fields
	constructor with parameters
	method printStudents (List students, Integer course),
		which receives a list of students and the course number and prints to the console the names of the students from the list,
		which are taught in this course (use an iterator)
	methods to compare students by name and by course
	
	In the main() method 
	
	declare List students and add to the list five different students
	display the list of students ordered by name
	display the list of students ordered by course.

 * @author Taras Krasitskyi
 *
 */

public class Student implements Comparable<Student> {

	public static class ByName implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return st1.getName().compareTo(st2.getName());

		}
	}

	public static class ByCourse implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return st1.getCourse() - st2.getCourse();
		}
	}

	public static class ByCourseName implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			int ByCourse = st1.getCourse() - st2.getCourse();
			return ByCourse == 0 ? st1.getName().compareTo(st2.getName()) : ByCourse;

		}
	}

	private String name;
	private int course;

	public Student() {
		name = "NoName";
		course = 0;
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	// method printStudents (List students, Integer course),
	// which receives a list of students and the course number and prints to the
	// console the names of the students from the list,
	// which are taught in this course (use an iterator)

	public void printStudent(List<Student> students, int course) {
		List<Student> listStudentOfCourse = new ArrayList<Student>();
		for (Student st : students) {
			if (st.getCourse() == course) {
				listStudentOfCourse.add(st);
			}
		}
		if (!listStudentOfCourse.isEmpty()) {
			System.out.println("\tStudents on course "+ course+": ");
			for (Student st : listStudentOfCourse)
				System.out.println(st);
		}else {
			System.out.println("\tNo students on course "+ course);
			
		}
		System.out.println("----------------------------------------------------");

	}

	@Override
	public int compareTo(Student student) { // defualt compare byName
		return name.compareTo(student.getName());
	};

	

}
