package HW05;

public class Task {
    public static void main(String[] args) {

        Employee str1 = new Employee ("Andrej", 8, 40);
        Employee str2 = new Employee ("Pavlo", 7, 50);
        Employee str3 = new Employee ("example", 9, 30);
        System.out.println("Total salary = " + str3.totalSum1());
    }
}