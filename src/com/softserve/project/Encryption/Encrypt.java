package com.softserve.project.Encryption;

import java.nio.charset.StandardCharsets;


public class Encrypt {
    private String text;

    protected Encrypt(String text) {
        this.text = text.trim();
    }

    protected String getText() {
        return text;
    }

    protected void setText(String text) {
        this.text = text;
    }

    protected void inEncr(Encrypt enc) {
        byte[] arr1 = enc.text.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 == 1) arr1[i] = (byte) (arr1[i] + 1);
            else arr1[i] = (byte) (arr1[i] - 1);
        }
        enc.setText(new String(arr1));
    }

    protected void unEncr(Encrypt enc) {
        byte[] arr1 = enc.text.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 != 1) {
                arr1[i] = (byte) (arr1[i] + 1);
            } else {
                arr1[i] = (byte) (arr1[i] - 1);
            }
        }
        enc.setText(new String(arr1));
    }
}
