package com.softserve.edu.HW12.Spaces;
/*
Enter a sentence that contains the words between more than one space.
Convert all spaces, consecutive, one.
For example, if we introduce the sentence
"I    am      learning     Java   Core»,
we have to get the "I'm learning Java Core»

 */

import java.util.Scanner;

public class Spaces {

    public StringBuilder removeSpaces(StringBuilder str) {

        int start = 0;
        int index = 0;
        while (str.indexOf("  ") != -1)
            str.delete(str.indexOf("  "),str.indexOf(" ")+1);

        /*while (str.indexOf("", start) != -1) {
            index = str.indexOf("", start);
            while (str.charAt(index + 1) == ' ') {
                str.deleteCharAt(index + 1);
                //index++;
            }
           start = str.indexOf("", start) + 1;
        }*/
    return str;

    }

}
