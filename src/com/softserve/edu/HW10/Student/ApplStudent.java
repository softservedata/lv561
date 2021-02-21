package com.softserve.edu.HW10.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplStudent {
	// ---Main-----
		public static void main(String[] args) {

			List<Student> listStudent = new ArrayList<>();
			listStudent.add(new Student("Mark", 1));
			listStudent.add(new Student("Anna", 3));
			listStudent.add(new Student("Wein", 1));
			listStudent.add(new Student("Jane", 3));
			listStudent.add(new Student("Mery", 2));

			System.out.println("\tPrint using listStudent.toString");
			System.out.println(listStudent);
			System.out.println("----------------------------------------------------");

			System.out.println("\tPrint using 	for(Student st: listStudent)");
			for (Student st : listStudent) {
				System.out.println(st);

			}
			System.out.println("----------------------------------------------------");

			System.out.println("\tSorted listStudent comparator ByName() ");
			// listStudent.sort(new Student.ByName());
			Collections.sort(listStudent, new Student.ByName());
			for (Student st : listStudent) {
				System.out.println(st);

			}
			System.out.println("----------------------------------------------------");
			System.out.println("\tSorted listStudent comparator ByCourse() ");
			Collections.sort(listStudent, new Student.ByCourse());
			for (Student st : listStudent) {
				System.out.println(st);

			}
			System.out.println("----------------------------------------------------");
			System.out.println("\tSorted listStudent comparator ByCourseName() ");
			Collections.sort(listStudent, new Student.ByCourseName());
			for (Student st : listStudent) {
				System.out.println(st);

			}
			System.out.println("----------------------------------------------------");
			
			Student student = new Student();
			student.printStudent(listStudent, 5); //чи правильно викликається метод student.printStudent(listStudent, 5); як це робити правильно.

		}

}
