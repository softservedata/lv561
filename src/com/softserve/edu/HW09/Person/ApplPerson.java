package com.softserve.edu.HW09.Person;

/*-

 * Create next structure.
  In abstract class Person with property name, declare abstract method print().
  In other classes in body of method print() output text - I am a ...-
  In class Staff declare abstract method salary().
  In each concrete class create constant TYPE_PERSON.
  Output type of person in each constructors.
  Create array of Person and add some Teachers, Cleaners and Students to it.
  Call method print() for all of it.
  Call method salary() for all Teachers and Cleaner

 */
public class ApplPerson {

	public static void main(String[] args) {
		Person st = new Student("Mike");
		System.out.println(st + "\n");
		Person st1 = new Student();
		System.out.println(st1 + "\n");
		st.print();
		System.out.println();

		Staff cl1 = new Cleaner();
		System.out.println(cl1 + "\n");
		Staff cl2 = new Cleaner("Jack", 1500);
		System.out.println(cl2 + "\n");
		cl2.print();
		cl2.salary();
		System.out.println();
		// cl2. getTypePerson();

		Staff tc1 = new Teacher();
		System.out.println(tc1 + "\n");
		Staff tc2 = new Teacher("Joe", 2500);
		System.out.println(tc2 + "\n");
		tc2.print();

		tc2.salary();

		System.out.println();

		// -----

		Person st2 = new Student("Bill");
		Person st3 = new Student("Anna");
		Person tc3 = new Teacher("July", 3000);
		Person[] prs = new Person[6];
		prs[0] = st;
		prs[1] = cl2;
		prs[2] = tc2;
		prs[3] = st2;
		prs[4] = st3;
		prs[5] = tc3;
		System.out.println("-------------");
		for (int i = 0; i < prs.length; i++) {
			prs[i].print();
			if ((prs[i].getTypePerson()).equals("TEACHER") || (prs[i].getTypePerson()).equals("CLEANER")) {
				((Staff) prs[i]).salary(); /// !!!!!!!

			}

		}

	}

}
