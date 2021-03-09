package hw10_java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;

/*
 * Practical Part.
 * Print n random numbers on console using Java 8
 * Print n random numbers on console using Java 8 in a sorted order
 * Using Java 8 show the biggest number from n random numbers
 * Show which today is a day of a week
 * Show a date of first Monday for current month
 * Write a method for sorting list of Strings using Java 8
 */

public class Practical {
	
	// method for sorting list of Strings
	public void sortList() {
		List<String> list = new ArrayList<>(Arrays.asList("Jane", "George", "Elisabeth", "John"));
		list = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
	}

	public static void main(String[] args) {
		
		// print n random numbers on console
		List<Integer> numbers = new Random().ints(0, 100).limit(5).boxed().collect(Collectors.toList());
		System.out.println(numbers);

		// print n random numbers in a sorted order
		List<Integer> numbersSorted = new Random().ints(0, 100).limit(5).boxed().sorted().collect(Collectors.toList());
		System.out.println(numbersSorted);
		
		// printing max value from random numbers
		Integer max = numbers.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
		System.out.println("max = " + max);
		
		// figuring the day today
		DayOfWeek today = LocalDate.now().getDayOfWeek();
		System.out.println("Today is : " + today);
		
		// getting first monday of current month
	    LocalDate dateOfFirstMonday = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); 
	    System.out.println("date of first monday in current month = " + dateOfFirstMonday);
	    
	   	
	}
}
