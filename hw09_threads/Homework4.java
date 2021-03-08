package hw09_threads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/*
 * Create file1.txt file with a text about your career.
 * Read context from file into array of strings. 
 * Each array item contains one line from file.
 * Write in to the file2.txt
 * 	1) number of lines in file1.txt.
 * 	2) the longest line in file1.txt.
 * 	3) your name and birthday date.
 */
public class Homework4 {

	public static void main(String[] args) throws IOException {
		List<String> list = Files.readAllLines(Paths.get("resources/file1.txt"));
		String[] strings = new String[list.size()];
		for(int i = 0; i < list.size(); i++) {
			strings[i] = new String(list.get(i));
		}
		
		// print text from file on console
		for(String s : strings) {
			System.out.println(s);
		}
		
		// creating file2.txt
		File newFile = new File("resources/file2.txt");
		if(newFile.createNewFile()) {
			System.out.println("File created: " + newFile.getName());
		} else {
			System.out.println("File already exists");
		}
		
		FileWriter writer = new FileWriter("resources/file2.txt");
		writer.write("Number of lines = " + strings.length); // number of lines in file1.txt
		
		// the longest line in file1.txt
		int index = 0;
		int eLength = strings[0].length();
		for(int i = 0; i < strings.length; i++) {
			if(strings[i].length() > eLength) { 
				index = i; 
				eLength = strings[i].length();
			}
		}	
		
		// writing to file2.txt the longest line in file1.txt
		writer.write("the longest line is at position " + (index + 1) + " : " + strings[index]);
		writer.write("My name is Anastasia, born in February, 23");
		writer.close();
		System.out.println("Successfuly wrote to file2.txt");
		

	}

}
