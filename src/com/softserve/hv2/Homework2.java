package com.softserve.hv2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person ("Ivan", "Ivanov");
		System.out.println("Enter birth year of the person");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int by = 0;
		try {
			by = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.output();
	}

}
