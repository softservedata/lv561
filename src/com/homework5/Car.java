package com.homework5;
import java.util.Scanner;


/*Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
certain model year  (enter year in the console);
ordered by the field year.
*/

class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    private Car() {

    }

    private Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Car carFirst = new Car();
        carFirst.setType("Suzuki");
        carFirst.setEngineCapacity(2.4);
        Car secondCar = new Car();
        carFirst.setType("Toyota");
        carFirst.setEngineCapacity(4.0);
        Car thirdCar = new Car();
        carFirst.setType("Dodge");
        carFirst.setEngineCapacity(4.4);
        Car forthCar = new Car();
        carFirst.setType("Tesla");
        carFirst.setEngineCapacity(0.0);



    System.out.println(carFirst.getType() + " " + carFirst.getEngineCapacity() + " " + carFirst.getYearOfProduction());
        System.out.println("Array of Cars: ");
        Car[] Cars = {carFirst, secondCar, thirdCar, forthCar};

        for(Car car : Cars){

            System.out.print("YearOfProduction firstCar: ");
            carFirst.setYearOfProduction(Integer.parseInt(scanner.nextLine()));
            System.out.print("YearOfProduction secondCar: ");
            secondCar.setYearOfProduction(Integer.parseInt(scanner.nextLine()));
            System.out.print("YearOfProduction thirdCar: ");
            thirdCar.setYearOfProduction(Integer.parseInt(scanner.nextLine()));
            System.out.print("YearOfProduction forthCar: ");
            forthCar.setYearOfProduction(Integer.parseInt(scanner.nextLine()));
        }
        System.out.print(carFirst.getType() + " "
                + carFirst.getEngineCapacity() + " " + carFirst.yearOfProduction);



        System.out.println("Sorted by the field year");
        Car car = new Car();
        boolean sort = true;
        for (int i = 0; i < Cars.length - 1; i++) {
            for (int j = 0; j < Cars.length -1; j++) {
                if (Cars[i].getYearOfProduction() < Cars[j+1].getYearOfProduction()) {
                    car = Cars[i];
                    Cars[i] = Cars[j];
                    Cars[j + 1] = car;
                    sort = false;
                }
            }if(sort){break;}
        }
        for (int i = 0; i < Cars.length; i++) {
            System.out.println(Cars[i]);
        }
    }
       }





