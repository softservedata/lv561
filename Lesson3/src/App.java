public class App {
    public static void main(String[] args) {
        byte b=49;
        System.out.println("b " + b);
        //char c = (char) b; //явне зведення типу, зрозуміти букву "b" як символ
        System.out.println("c " + (char)b);
/*
        int a, b, c;         // Declares three ints, a, b, and c.
        int x = 10, y = 10;  // Example of initialization
        double pi = 3.14159; // declares and assigns a value of PI
        char e = 'a';        // the char variable e is initialized with value 'a'
 */
        String s = "123";
        //b=(byte)s; //Compile Error - неможе стрічку звести в тип byte

    }
}
