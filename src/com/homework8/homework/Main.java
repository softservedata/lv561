package com.homework8.homework;

/*Enter in the console sentence of five words.
display the longest word in the sentence
determine the number of its letters
bring the second word in reverse order
Enter a sentence that contains the words between more than one space.
Convert all spaces, consecutive, one. For example,
if we introduce the sentence "I    am      learning     Java   Core»,
we have to get the "I'm learning Java Core»
Implement a pattern for US currency: the first symbol "$",
then any number of digits, dot and two digits after the dot.
Enter the text from the console that contains several occurrences of US currency.
Display all occurrences on the screen.

Введіть у консольне речення п’ять слів.
відобразити найдовше слово в реченні
визначити кількість його букв
привести друге слово у зворотному порядку
Введіть речення, що містить слова між кількома пробілами.
Перетворити всі пробіли, послідовні, один. Наприклад, якщо ми введемо речення
"Я вивчаю Java Core", ми повинні отримати "Я вивчаю Java Core"
Введіть шаблон для американської валюти: перший символ "$",
 потім будь-яку кількість цифр, крапку та дві цифри після крапки.
  Введіть текст із консолі, який містить кілька випадків використання американської валюти.
   Відобразити всі випадки на екрані.
* */

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Enter in the console sentence of five words.
        display the longest word in the sentence
        determine the number of its letters
        bring the second word in reverse order*/

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            System.out.println("Enter sentence of five words - " + input);
            

           /*tring[] arrayWords = input.split(" ");
            String maxWord = "";
            for(int i = 0; i < arrayWords.length; i++){
                if(arrayWords[i] < arrayWords[i+1]){
                    maxWord = arrayWords[i]; }

            }System.out.println(maxWord);*/


    }
}
