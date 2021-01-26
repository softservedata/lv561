package com.company;

public class Main {

    public static void main(String[] args) {
	    double radius = 5, perimetr, area;

	    perimetr = 2 * Math.PI * radius;
	    area = Math.PI * radius * radius;

	    System.out.println("Периметр кола, радіусу " + radius + " = " + perimetr);
        System.out.println("Площа кола, радіусу " + radius + " = " + area);
    }
}
