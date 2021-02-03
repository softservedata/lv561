package hw03_conditional;

import java.util.Scanner;

/*
 * Practice Task 2. 
 * Enter the number of the day of the week. 
 * Display the name in three languages
 */

public class Task2Days {
	
	void getDays() {
		System.out.println("Enter number of the day: ");
        Scanner in = new Scanner(System.in);
        int select = in.nextInt();
        
        switch (select) {
        case 1:
           System.out.println("Понеділок - Monday - Lundi");
            break;
        case 2:
            System.out.println("Вівторок - Tuesday - Mardi");
            break;
        case 3:
        	System.out.println("Середа - Wednesday - Mercredi");
            break;
        case 4:
        	System.out.println("Четвер - Thursday - Jeudi");
        	break;
        case 5: 
        	System.out.println("П'ятниця - Friday - Vendredi");
        	break;
        case 6:
        	System.out.println("Субота - Saturday - Samedi");
        	break;
        case 7:
        	System.out.println("Неділя - Sunday - Dimanche");
        	break;
        default:
            System.out.println("Choose from 1 to 7");           
        }         
        in.close();
	}

}
