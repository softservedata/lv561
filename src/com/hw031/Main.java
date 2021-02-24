package com.hw031;
import java.util.Scanner;

enum Continents{
    EURASIA("Eurasia"),
    AFRICA("Africa"),
    AMERICA("America"),
    AUSTRALIA("Australia"),
    ANTARCTICA("Antarctica");

    private String name;

    private Continents(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

}


public class Main {
    public static void main(String[] args) {

        int n = 0;
        int odd = 0;

        System.out.println("Enter 3 number - ");

        for (int i = 0; i < 3; i++){

            Scanner scr = new Scanner(System.in);
            n = scr.nextInt();

            if (n % 2 != 0){
                odd++;
            }

        }

        System.out.println("Odd numbers - " + odd);
        System.out.println("--------------------------------");

//--------------------------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------------------------

        int u = 0;
        String day = "";
        System.out.print("Enter the number of the day of the week - ");

        Scanner sc = new Scanner(System.in);
        u = sc.nextInt();

        switch(u){
            case 1: day = "Today is - Monday, Понеділок, Понедельник\n--------------------------------\n";
                break;
            case 2: day = "Today is - Tuesday, Вівторок, Вторник\n--------------------------------\n";
                break;
            case 3: day = "Today is - Wednesday, Середа, Среда\n--------------------------------\n";
                break;
            case 4: day = "Today is - Thursday, Четвер, Четверг\n--------------------------------\n";
                break;
            case 5: day = "Today is - Friday, П'ятниця, Пятница\n--------------------------------\n";
                break;
            case 7: day = "Today is - Sunday, Неділя, Воскресенье\n--------------------------------\n";
                break;
            default: day = "Error\n--------------------------------\n";
                break;
        }

        System.out.print(day);

//--------------------------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------------------------

        String country = "";
        System.out.println("Enter one of this countries to know on which continent it is - \nUkraine, USA, Germany, Japan, China, Australia, Egypt");

        Scanner scra = new Scanner(System.in);
        country = scra.nextLine();
        switch (country){
            case "Ukraine":
                System.out.println("Ukraine is located in " + Continents.EURASIA.toString() + "\n--------------------------------");
                break;
            case "USA":
                System.out.println("USA is located in " + Continents.AMERICA.toString() + "\n--------------------------------");
                break;
            case "Germany":
                System.out.println("Germany is located in " + Continents.EURASIA.toString() + "\n--------------------------------");
                break;
            case "Japan":
                System.out.println("Japan is located in " + Continents.EURASIA.toString() + "\n--------------------------------");
                break;
            case "China":
                System.out.println("China is located in " + Continents.EURASIA.toString() + "\n--------------------------------");
                break;
            case "Australia":
                System.out.println("Australia is located in " + Continents.AUSTRALIA.toString() + "\n--------------------------------");
                break;
            case "Egypt":
                System.out.println("Egypt is located in " + Continents.AFRICA.toString() + "\n--------------------------------");
                break;
            default:
                System.out.println("Error\n--------------------------------");
                break;
        }

//--------------------------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------------------------

        Product banana = new Product("Banana", 1, 10000);
        Product book = new Product("Book", 10, 1000);
        Product water = new Product("Water", 4, 100000);
        Product car = new Product("Car", 30000, 10);


        int k = 4, max;
        int a[] = new int[k];

        a[0] = banana.price;
        a[1] = book.price;
        a[2] = car.price;
        a[3] = water.price;
        max = a[0];

        for (int l = 0; l < k; l++) {

            if (max < a[l]) {
                max = a[l];
            }
        }


        if (max == banana.price){
            System.out.println("The most expensive item - " + banana.name);
            System.out.println("It costs - " + banana.price + "$");
            System.out.println("This product is available in quantities - " + banana.quantity);
            System.out.println("--------------------------------");
        }else if (max == book.price){
            System.out.println("The most expensive item - " + book.name);
            System.out.println("It costs - " + book.price + "$");
            System.out.println("This product is available in quantities - " + book.quantity);
            System.out.println("--------------------------------");
        }else if (max == car.price){
            System.out.println("The most expensive item - " + car.name);
            System.out.println("It costs - " + car.price + "$");
            System.out.println("This product is available in quantities - " + car.quantity);
            System.out.println("--------------------------------");
        }else if (max == water.price){
            System.out.println("The most expensive item - " + water.name);
            System.out.println("It costs - " + water.price + "$");
            System.out.println("This product is available in quantities - " + water.quantity);
            System.out.println("--------------------------------");
        }


        int m = 4, maxi;
        int b[] = new int[m];

        b[0] = banana.quantity;
        b[1] = book.quantity;
        b[2] = car.quantity;
        b[3] = water.quantity;
        maxi = b[0];

        for (int s = 0; s < m; s++) {

            if (maxi < b[s]) {
                maxi = b[s];
            }
        }


        if (maxi == banana.quantity){
            System.out.println("The biggest quantity - " + banana.quantity);
            System.out.println("This is - " + banana.name);
            System.out.println("Price - " + banana.price + "$");
            System.out.println("--------------------------------");
        }else if (maxi == book.quantity){
            System.out.println("The biggest quantity - " + book.quantity);
            System.out.println("This is - " + book.name);
            System.out.println("Price - " + book.price + "$");
            System.out.println("--------------------------------");
        }else if (maxi == car.quantity){
            System.out.println("The biggest quantity - " + car.quantity);
            System.out.println("This is - " + car.name);
            System.out.println("Price - " + car.price + "$");
            System.out.println("--------------------------------");
        }else if (maxi == water.quantity){
            System.out.println("The biggest quantity - " + water.quantity);
            System.out.println("This is - " + water.name);
            System.out.println("Price - " + water.price + "$");
            System.out.println("--------------------------------");
        }
    }
}
