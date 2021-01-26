package com.hw011;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double radius, perimetr, area;

        System.out.print("Please, enter radius of flower bed: ");
        Scanner r = new Scanner(System.in);
        radius = r.nextInt();

        perimetr = 2 * 3.14 * radius;
        area = 3.14 * radius * radius;

        System.out.println("Circle radius - " + radius);
        System.out.println("Circle perimetr - " + perimetr);
        System.out.print("Circle area - " + area);

    }
}
