package com.softserve.edu01;

public class Example {

	private int i = 0;

//	public Example(int i) {
//		System.out.println(i);
//	}

	public void m1() {
		System.out.println("method m1(); i = " + i);
	}

	public static void main(String[] args) {
		System.out.println("My first program");
		for (int i = 0; i < args.length; i++) {
			System.out.println("Arg " + i + " is " + args[i]);
		}
		//
		Example ex = new Example();
		ex.m1();
		ex.i = 123;
		ex.m1();
		//
		Example ex2 = new Example();
		ex2.i = 4321;
		ex2.m1();
		//
		ex.m1();
		//
		boolean res = (ex.i == ex2.i);
		System.out.println("(ex.i == ex2.i) res = " + res);
		res = (ex.i <= ex2.i);
		System.out.println("(ex.i <= ex2.i) res = " + res);
		//
		String s = "Hello World";
		res = s.isEmpty();
		System.out.println("s.isEmpty() res = " + res);
		int k = 333;
		Integer k1 = 222;
	}

}
