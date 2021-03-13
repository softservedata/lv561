package com.softserve.project.Encryption;

import java.util.Scanner;

public class ApplEnc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Encrypt enc = new Encrypt(text);
        sc.close();
        enc.inEncr(enc);

        System.out.println(enc.getText());

        enc.unEncr(enc);

        System.out.println(enc.getText());



    }
}
