package com.hw042;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] month = new int[12];

        month[0] = 31;
        month[1] = 28;
        month[2] = 31;
        month[3] = 30;
        month[4] = 31;
        month[5] = 30;
        month[6] = 31;
        month[7] = 31;
        month[8] = 30;
        month[9] = 31;
        month[10] = 30;
        month[11] = 31;

        System.out.print("Please enter the month number to see how many days there are - ");
        Scanner scr = new Scanner(System.in);

        int k = scr.nextInt();
        if (k < 1 || k > 12){
            System.out.println("Error");
            System.exit(0);
        }

        System.out.println(month[k - 1]);
        System.out.println("----------------------------------");

//        --------------------------------------------------------------------------------------------------------------
//        --------------------------------------------------------------------------------------------------------------

        int[] arr = new int[10];
        int sum = 0, pos = 0, product = 1;

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 8;
        arr[3] = 4;
        arr[4] = 10;
        arr[5] = 1;
        arr[6] = 4;
        arr[7] = -3;
        arr[8] = 2;
        arr[9] = 10;

        for (int i = 0; i < 5; i++) {
            if (arr[i] >= 0) {
                pos++;
            }
        }

        if (pos == 5){
            for (int i = 0; i < 5; i++){
                sum = sum + arr[i];
            }
            System.out.println("Sum of first 5 elements - " + sum);
        }else {
            for (int j = 5; j < 10; j++) {
                product = product * arr[j];
            }
            System.out.println("Product of last 5 elements - " + product);
        }
        System.out.println("----------------------------------");

//        --------------------------------------------------------------------------------------------------------------
//        --------------------------------------------------------------------------------------------------------------

        int[] array = new int[5];
        int poz = 0, temp = 0, pozmin = 0;

        array[0] = 100;
        array[1] = 62;
        array[2] = 98;
        array[3] = -173;
        array[4] = 10;

        for (int f = 0; f < array.length; f++){
            if (array[f] >= 0){
                poz++;
                if (poz == 2){
                    System.out.print("Position of second positive number - ");   // Чого якщо два прінта разом, то воно дуже криво працює??
                    System.out.println(f + 1);
                    System.out.println("----------------------------------");
                }
            }
        }

        if (poz == 1){
            System.out.println("There are only 1 positive number");
            System.out.println("----------------------------------");
        }else if(poz == 0) {
            System.out.println("There are no positive numbers");
            System.out.println("----------------------------------");
        }

        for (int t = 0; t < array.length; t++){
            if (array[t] > temp){
                temp = array[t];
            }
        }

        for (int q = 0; q < 5; q++){
            if (array[q] < temp){
                temp = array[q];
                pozmin = q;

            }
        }

        System.out.println("Minimum - " + temp);
        System.out.print("Position in the array - ");
        System.out.println(pozmin + 1);
        System.out.println("----------------------------------");

//        --------------------------------------------------------------------------------------------------------------
//        --------------------------------------------------------------------------------------------------------------

//        Чого це так працює? Адже сказано що спочатку 10 ячейок виділяється, а коли загуглив помилку пише таке -
//        Since ArrayList is a growable array, it automatically resizes when the size (number of elements in array list)
//        grows beyond a threshold. Also, when an ArrayList is first created it is called empty ArrayList and size() will
//        return zero. If you add elements then size grows one by one.


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // Прийшлось рбити такий прікол
        int sumi = 1;

        for (int g = 0; g < arrayList.size(); g++){
            Scanner scra = new Scanner(System.in);
            if (arrayList.get(g) < 0){
                break;
            }
            arrayList.add(scra.nextInt());
            if (arrayList.get(g) % 2 == 0){
                sumi = sumi * arrayList.get(g);
            }
        }

        if (sumi == 1){
            System.out.println("You dont enter any even numbers");
        }else {
            System.out.println("Product of all entered even numbers - " + sumi);
        }
        System.out.println("----------------------------------");

//        --------------------------------------------------------------------------------------------------------------
//        --------------------------------------------------------------------------------------------------------------

        Car lada = new Car("just car", 2050,400);
        Car audi = new Car("sports car", 1971,700);
        Car jeep = new Car("jeep", 2000,5000);
        Car mers = new Car("truck", 1993,300);

//        Як правильно це зробити? щоб в кейсах, замість цифр була змінна year???
//        Просто якщо буде більше машин, щоб не добавляти кожну, а воно само по року знаходило
//        Як звернутись не до одної машини, а до всіх обєктів класу зразу? наприклад - не lada.print()бо це тільки до одної, а до всіх так

        System.out.print("Please enter a year - ");
        Scanner scanner = new Scanner(System.in);
        int caryear = scanner.nextInt();

        switch (caryear){
            case 2050:
                lada.print();
                break;
            case 1971:
                audi.print();
                break;
            case 2000:
                jeep.print();
                break;
            case 1993:
                mers.print();
                break;
            default:
                System.out.println("Unfortunately, we do not have cars of this year");
                System.out.println("----------------------------------");
                break;
        }

//        Сортувати я відповідно також не можу........

    }
}
