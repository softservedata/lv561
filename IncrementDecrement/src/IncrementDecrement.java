import java.util.Scanner;

public class IncrementDecrement {

    public static void main(String[] arg){
        Scanner vvedenaInfa = new Scanner (System.in);
        System.out.println("введіть кількість морозива");
        int morozyvo;
        morozyvo = vvedenaInfa.nextInt();

        //morozyvo = morozyvo+1;
        //morozyvo++;

        System.out.print("Нова кількість: ");
        //System.out.println(++morozyvo); // пре-інкремент
        //System.out.println(morozyvo++); // пост-інкремент
        //System.out.println(morozyvo);

        //System.out.println(--morozyvo); // пре-декремент
        //System.out.println(morozyvo--); // пост-декремент
        //System.out.println(morozyvo);

        System.out.println(morozyvo*=5); // morozyvo = morozyvo * 5
    }

}
