package com.softserve.edu17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ApplTime {
	public static void main(String[] args) {
		// /*-
		long currentTime = System.currentTimeMillis();
		System.out.println("currentTime = " + currentTime);
		//
		Date date = new Date(currentTime);
		System.out.println("default = " + date);
		//
		String myTime = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS a").format(date);
				//.format(new Date());
		System.out.println("Formatted = " + myTime);
		// */
	}
}
