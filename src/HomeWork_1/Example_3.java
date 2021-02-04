import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Example_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введіть вартість дзвінка_1: ");
        float c1 = Float.parseFloat(reader.readLine());

        System.out.println("Введіть вартість дзвінка_2: ");
        float c2 = Float.parseFloat(reader.readLine());

        System.out.println("Введіть вартість дзвінка_3: ");
        float c3 = Float.parseFloat(reader.readLine());

        System.out.println("Введіть триваість дзвінка_1: ");
        float t1 = Float.parseFloat(reader.readLine());

        System.out.println("Введіть триваість дзвінка_2: ");
        float t2 = Float.parseFloat(reader.readLine());

        System.out.println("Введіть триваість дзвінка_3: ");
        float t3 = Float.parseFloat(reader.readLine());


        System.out.println("Вартість дзвінка_1 = " + (c1 * t1));
        System.out.println("Вартість дзвінка_2 = " + (c2 * t2));
        System.out.println("Вартість дзвінка_3 = " + (c3 * t3));
        System.out.println("Вартість всіх дзвінків загалом = " + ((c1 * t1) + (c2 * t2) + (c3 * t3)));
    }
}
