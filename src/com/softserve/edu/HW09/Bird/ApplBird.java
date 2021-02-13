package com.softserve.edu.HW09.Bird;
/*-
 * 
 * Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().  
	Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken. 
	Create array Bird and add different birds to it. 
	Call fly() method for all of it. Output the 
	information about each type of created bird.

 * 
 * @author Taras Krasitskyi
 *
 */

public class ApplBird {

	public static void main(String[] args) {

		Bird egl1 = new Eagle();
		System.out.println(egl1);
		egl1.fly();
		System.out.println("---------------------------");
		Bird swll1 = new Swallow();
		System.out.println(swll1);
		swll1.fly();
		System.out.println("---------------------------");
		Bird png1 = new Penguin();
		System.out.println(png1);
		png1.fly();
		System.out.println("---------------------------");
		Bird chc1 = new Chicken();
		System.out.println(chc1);
		chc1.fly();
		System.out.println("---------------------------");

		// Create array Bird and add different birds to it.
		// Call fly() method for all of it. Output the
		// information about each type of created bird.
		System.out.println("\nInformatin from array Bird:\n");
		Bird[] brd = new Bird[4];
		brd[0] = chc1;
		brd[1] = png1;
		brd[2] = swll1;
		brd[3] = egl1;
		for (int i = 0; i < brd.length; i++) {
			System.out.println(brd[i]);
			brd[i].fly();
			System.out.println("---------------------------");
		}

	}
}
