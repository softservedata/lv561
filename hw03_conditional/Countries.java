package hw03_conditional;

import java.util.Scanner;

/*
 *  Practice Task 3. 
 *  Enter name of the country. Print the name of the continent,
 *  according to the declared enum with names of the continents
 */

enum Continents {
	EUROPE, NORTH_AMERICA, SOUTH_AMERICA, AFRICA, OCEANIA, ANTARCTICA, ASIA;

}

public class Countries {
	
	void getContinent() {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter country: ");       
        String country = in.nextLine();
        
        switch (country) {
        case "Ukraine":
           System.out.print(Continents.EUROPE.toString());
            break;
        case "Canada":
        	System.out.print(Continents.NORTH_AMERICA.toString());
            break;
        case "Egypt":
        	System.out.print(Continents.AFRICA.toString());
            break;
        case "China":
        	System.out.print(Continents.ASIA.toString());
        	break;
        case "Australia": 
        	System.out.print(Continents.OCEANIA.toString());
        	break;
        case "Argentina":
        	System.out.print(Continents.SOUTH_AMERICA.toString());
        	break;
        default:
            System.out.println("Invalid data");  
            break;
        } 
        
        in.close();
	}

}
