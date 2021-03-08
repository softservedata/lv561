package hw09_threads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/*
 * Practical Task #3. 
 * Prepare mytext.txt file with a lot of text inside.
 * Read context from file into array of strings.
 * Each array item contains one line from file.
 * Complete next tasks:
 * 	1) count and write the number of symbols in every line.
 * 	2) find the longest and the shortest line. 
 * 	3) find and write only that lines, which consist of word «var»
 */
public class Practical3 {

	public static void main(String[] args) throws IOException {
				
		List<String> list = Files.readAllLines(Paths.get("resources/mytext.txt"));
		String[] strings = new String[list.size()];
		for(int i = 0; i < list.size(); i++) {
			strings[i] = new String(list.get(i));
		}
		
		// print text from file on console
		for(String s : strings) {
			System.out.println(s);
		}
		
		// count and write the number of symbols in each line
		for(int i = 0; i < strings.length; i++) {
			System.out.println("number of sybols in #" + (i + 1) + " line = " + strings[i].length());
		}
		
		// find the longest and the shortest lines
		int index = 0;
		int eLength = strings[0].length();
		for(int i = 0; i < strings.length; i++) {
			if(strings[i].length() > eLength) { 
				index = i; 
				eLength = strings[i].length();
			}
		}		
		System.out.println("the longest line is at position " + (index + 1) + " : " + strings[index]);
		
		int index2 = 0;
		int eLength2 = strings[0].length();
		for(int i = 0; i < strings.length; i++) {
			if(strings[i].length() < eLength2) { 
				index2 = i; 
				eLength2 = strings[i].length();
			}
		}
		System.out.println("the shortest line is at position " + (index2 + 1) + " : " + strings[index2]);

		// find and write only that lines, which consist of word «var»
		String inputString = "var";
		
		for(int i = 0; i < strings.length; i++) {
			String[] contents = strings[i].split(" ");
			for(int j = 0; j < contents.length; j++) {
				if(inputString.equals(contents[j])) {
					System.out.println("line contains 'var' = " + strings[i]);
				} 
			} 
			
		}
	
		
	}
}
