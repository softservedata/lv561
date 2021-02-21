package com.softserve.edu.HW12.PT1;
/*-
 * Enter the two variables of type String.
 * Determine whether the first variable substring second.
 * For example, if you typed «IT» and «IT Academy» you must receive true.

 * 
 * @author Taras Krasitskyi
 *
 */

public class ApplSubStr {

	public boolean subStr(String st1, String st2) {
		if (st2.indexOf(st1)==-1)
			return false;
			else
		return true;
		
	}

	public static void main(String[] args) {
		
		String s1 = "IT";
		String s2 = "IT Academy";
		ApplSubStr ins = new ApplSubStr();
		System.out.println(ins.subStr(s1, s2));

	}
}
