package com.softserv.javacore.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameAdress {
	public static void main(String[] args) throws IOException {
		System.out.print("What is your name? - ");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.print("Where are you live, "+name+"?\n");
		String adress = br.readLine();
		System.out.print ("You name - "+name+'\n'+ "You adress - "+adress);
		br.close();
	}

}
