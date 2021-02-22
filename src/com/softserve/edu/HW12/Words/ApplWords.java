package com.softserve.edu.HW12.Words;

import java.util.ArrayList;
import java.util.List;

public class ApplWords {
    public static void main(String[] args) {

        Words ins = new Words();
        List<String> str = new ArrayList<>();
        str = ins.enterSentence();
        ins.longestWord(str);
// bring the second word in reverse order
        StringBuilder sb = new StringBuilder(str.get(2));
        System.out.println("word \""+str.get(2)+"\" in reverse order: "+sb.reverse());
    }
}
