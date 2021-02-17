import java.util.Scanner;

public class Language {

    public static void main(String[] arg){

        System.out.println("Якою мовою Ви хочете спілкуватися?" + " Введіть 1 (українська) або 2 (англійська)?");
        Scanner mova = new Scanner(System.in);
        int number = mova.nextInt();

        if (number == 1) {
            System.out.println("Будемо спілкуватися українською");
        }
        else if (number == 2) {
            System.out.println("We continue in English");
        }
        else {
            System.out.println("Повторіть свій вибір");
        }

    }

}
