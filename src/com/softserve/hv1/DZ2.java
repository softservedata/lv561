package com.softserve.hv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ2 {

	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("Where do you live?");
		String address = br.readLine();
		System.out.println("Yor name is " + name + ". You live in " + address + ".");
	}
}
