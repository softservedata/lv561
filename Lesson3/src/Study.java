public class Study {

    private int i= 0; // поле класу - змінна і яка дорівнює нулю

    public void m1() {
        System.out.println("method m1(); i= " +i);
    }

    public static void main(String[ ] args) {
        System.out.println("My first program");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg " + i + " is " + args[i]);
        }
        //
        Study a = new Study (); // стоврюємо обєкт 'а' класу Study
        a.m1();
        a.i = 123;
        a.m1();
        //
        Study b = new Study ();
        b.m1 ();
        b.i = 432;
        b.m1();
        //
        a.m1();
        b.m1();
        //
        boolean res = (b.i!= a.i); //що вони не рівні = відповідь true
        System.out.println("res = b.i!= a.i " +res);
        //
        boolean res2 = (b.i== a.i);//що вони  рівні = відповідь false
        System.out.println("res2 = b.i== a.i " +res2);
        //
        boolean res3 = (b.i<a.i);
        System.out.println("res3 = b.i<a.i " +res3);
        //
        String s = "Hello World";
        res = s.isEmpty();
        System.out.println("s.isEmpty() res =  " + res);

    }

}
