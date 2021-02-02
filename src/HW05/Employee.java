package HW05;

public class Employee {
    private String name;
    private int rate, hours;
    private static int totalSum;

    static {
        totalSum = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    public Employee() {
    }

    public Employee(String name, int rate) {
        this();
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this();
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + (rate * hours);
    }

    public int getSalary() {
        return rate * hours;
    }

    public String toString() {
        return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
    }

    public void changeRate(int rate) {
        this.rate = rate;
    }

    public float getBonuses() {
        return (int) (0.1 * (rate * hours));
    }

    public float totalSum1() {
        return totalSum;
    }
}

