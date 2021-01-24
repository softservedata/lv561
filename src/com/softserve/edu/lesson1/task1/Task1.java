/**
 * Завдання до перошї лекції
 */
package com.softserv.javacore.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author Taras_Krasitskyi
 * int a,b
 * a+b = ?
 * a-b = ?
 * a/c = ?
 * a-b = ?
 *
 */
public class Task1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a - ");//use System.out.println - new line
		int a = Integer.parseInt(br.readLine());
		System.out.print("Input b - "); // use System.out.print - same line
		int b = Integer.parseInt(br.readLine());
		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+(a-b));
		System.out.println("a*b = "+(a*b));
		System.out.println("a/b = "+(a/b));
		br.close();
		
	}

}
