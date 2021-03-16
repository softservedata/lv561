package com.percifalll._04_condition_statements.practical;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number:");

        int dayNumber = scanner.nextInt();

        if (dayNumber > 0 && dayNumber < 8) {
            DaysOfTheWeek day = DaysOfTheWeek.setDay(dayNumber);

            System.out.printf("The %d day is %s (%s, %s)\n", dayNumber, day.name(), day.ua, day.ru);
        }
        else System.out.println("You entered wrong number");
    }

    public enum DaysOfTheWeek{
        MONDAY("ПОНЕДІЛОК", "ПОНЕДЕЛЬНИК"),
        TUESDAY("ВІВТОРОК", "ВТОРНИК"),
        WEDNESDAY("СЕРЕДА", "СРЕДА"),
        THURSDAY("ЧЕТВЕР", "ЧЕТВЕРГ"),
        FRIDAY("П'ЯТНИЦЯ", "ПЯТНИЦА"),
        SATURDAY("СУБОТА", "СУББОТА"),
        SUNDAY("НЕДІЛЯ", "ВОСКРЕСЕНЬЕ");

        private String ua, ru;
        DaysOfTheWeek(String ua, String ru){
            this.ua = ua;
            this.ru = ru;
        }
        public String[] getNames(){
            return new String[] {this.name(), this.ua, this.ru};
        }

        public static DaysOfTheWeek setDay(int number){
            return DaysOfTheWeek.values()[number - 1];
        }
    }
}
