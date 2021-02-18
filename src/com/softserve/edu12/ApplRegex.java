package com.softserve.edu12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplRegex {
	public static void main(String[] args) {
		// String pattern = "Now is the time";
		String pattern = "[A-Za-z ]+";
		//String pattern = "[a-z]+";
		//String pattern = "[theimeows]+";
		//
		String text = "Now is the time";
		//
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		//
		// 1. Is correspond
		if (m.matches()) {
			System.out.println("m.matches() OK");
		} else {
			System.out.println("m.matches() FALSE");
		}
		//
		// 2. Get all parts
		m.reset();
		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + "*");
		}
	}
}
