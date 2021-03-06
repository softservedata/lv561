package com.softserve.edu.HW13.PT2;

import java.util.ArrayList;
import java.util.List;

public class ApplPlant {

	public static void main(String[] args) {

		
		try {
			/*pl.add(new Plant("Rose", "White", 10));
			pl.add(new Plant("Tulip", "Pink", 7));
			pl.add(new Plant("Rose", "Black", 9));
			pl.add(new Plant("Sunflower", "Pink", 12));
			pl.add(new Plant("Flower", "Red", 2));
			pl.add(new Plant("Orhid", "Blue",23));*/
			
			Plant pl1 = new Plant("Rose", "White", 10);
			Plant pl2 = new Plant("Tulip", "Pink", 7);
		//	Plant pl3  = new Plant("Rose", "Black", 9);
			Plant pl4 = new Plant("Sunflower", "Pink", 12);
		//	Plant pl5 = new Plant("Flower", "Red", 2);
			Plant pl6 = new Plant("Orhid", "Blue",23);
			System.out.println(pl1 + "\n"+pl2 + "\n"+pl4 + "\n"+pl6 );

		} catch (ColorException | TypeException eX) {
			System.err.println("Error: "+eX);

		}

	}
}
