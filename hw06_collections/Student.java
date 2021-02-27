package hw06_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/*
 * Homework Task #3. 
 */

public class Student {
	private String name;
	private int course;
	
	Student(){}
	
	Student(String name, int course){
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
	
	public void printStudents(List<Student> students, int course) {
		Iterator<Student> iter = students.iterator();
		while(iter.hasNext()) {
			Student student = iter.next();
			if(course == student.getCourse()) {
				System.out.println("name: " + student.getName());
			}
		}
	}
	
	static Comparator<Student> byCourse = new Comparator<Student>() {
		@Override
		public int compare(Student s1, Student s2) {
			return s1.getCourse() - s2.getCourse();
		}
	};
	
	static Comparator<Student> byName = new Comparator<Student>() {
		@Override
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	};
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ivan Ivanenko", 1211));
		students.add(new Student("Taras Shevchenko", 1277));
		students.add(new Student("Petro Kozak", 1210));
		students.add(new Student("Kateryna Shevchenko", 1277));
		students.add(new Student("Anna Gavryliv", 1277));
		
		System.out.println("Sorting by Name: ");
		Collections.sort(students, Student.byName);
		for (Student s : students) {
			System.out.println(s);
		}
		
		System.out.println("\nSorting by Course: ");
		Collections.sort(students, Student.byCourse);
		for (Student s : students) {
			System.out.println(s);
		}
		
	}
}
