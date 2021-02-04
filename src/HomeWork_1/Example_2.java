import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Example_2 {
    public static void  main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Як Вас звати? ");
        String name = reader.readLine();

        System.out.println("Де ви живете " + name + "?");
        String adres = reader.readLine();

        System.out.println("Добрий день, " + name + "!");
        System.out.println("Ви проживаєте за адресою: " + adres);
    }
}
