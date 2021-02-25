package com.softserve.edu.HW12.Words;
/*-
    Enter in the console sentence of five words.
    display the longest word in the sentence
    determine the number of its letters
    bring the second word in reverse order
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Words {
	
    public List<String> enterSentence() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        StringBuilder sentence = new StringBuilder(sc.nextLine().trim());
        sc.close();
        List<String> words = new ArrayList<>();
        words.add(sentence.substring(sentence.lastIndexOf(" ") + 1, sentence.length()));
        int start = 0;
        int index = 0;
        while (sentence.indexOf(" ", start) != -1) {
            words.add(index, sentence.substring(start, sentence.indexOf(" ", start)));
            start = sentence.indexOf(" ", start) + 1;
            index++;
        }
        return words;
        //for(String str: words)
        //System.out.print(str+":");
    }

   // display the longest word in the sentence
   //    determine the number of its letters
   public void longestWord(List<String> words){
     int max = words.get(0).length();
     int index = 0;
     for(int i = 0; i<words.size(); i++){
         if(max<=words.get(i).length()){
             max = words.get(i).length();
             index = i;
         }

     }
     System.out.println("The longest word in the sentence is: "+"\""+words.get(index)+"\"");
     System.out.println("The number of its letters: "+words.get(index).length());

   }
}
