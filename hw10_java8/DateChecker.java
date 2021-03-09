package hw10_java8;

/*
 * Homework Task #3. 
 * Create method to validate date according to format "mm.dd.yy"
 */
public class DateChecker {

	public static boolean matchesDatePattern(String dateString) {
	    return dateString.matches("^((0[469]|11).(0[1-9]|[12][0-9]|30).\\d{2})$" 
	    					   + "|^((0[13578]|10|12).(0[1-9]|[12][0-9]|3[01]).\\d{2})$" 
	    					   + "|^(02.(0[1-9]|[12][0-9]).\\d{2})$"); 
	}
	
}
