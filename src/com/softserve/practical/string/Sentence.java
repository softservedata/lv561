package com.softserve.practical.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * Enter in the console sentence of five words.
 * Ddisplay the longest word in the sentence
 * determine the number of its letters
 * bring the second word in reverse order
 * 
 * 
 * @author Taras Krasitskyi
 *
 */

public class Sentence {

	public static List<String> sentenceToList(String sentence) {

		String tmpSentence = sentence + " ";
		List<String> listWords = new ArrayList<>();
		int startPosition = 0;
		int endPosition = tmpSentence.indexOf(" ", startPosition);
		while (endPosition != -1) {
			if (!(tmpSentence.substring(startPosition, endPosition).isEmpty())
					&& !(tmpSentence.substring(startPosition, endPosition)).equals(" ")) {
				listWords.add(tmpSentence.substring(startPosition, endPosition));
			}
			startPosition = endPosition + 1;
			endPosition = tmpSentence.indexOf(" ", startPosition);
		}
		return listWords;

	}

	public static List<String> longestWord(String sentence) {
		String longestWord = "";
		List<String> listWords = new ArrayList<String>();
		List<String> longestWords = new ArrayList<String>();
		listWords = Sentence.sentenceToList(sentence);
		longestWord = listWords.get(0);

		for (String listElement : listWords) {
			if (listElement.length() > longestWord.length()) {
				longestWord = listElement;
			}
		}

		for (String listElement : listWords) {
			if (listElement.length() == longestWord.length()) {
				longestWords.add(listElement);
			}
		}

		for (String listElement : longestWords) {
			System.out.println(
					"Longest word in sentence: \'" + listElement + "\' - " + listElement.length() + " letters.");
		}
		return longestWords;
	}

	public static String reversWord(String sentence, int word) {
		String reverseWord = "";

		List<String> listWords = new ArrayList<String>();
		listWords = sentenceToList(sentence);
		StringBuilder tmpString = new StringBuilder();
		tmpString.append(listWords.get(word - 1));
		reverseWord = (tmpString.reverse()).toString();
		return reverseWord;
	}

	public static void main(String[] args) {
		System.out.print("\tInput sentence: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputSentence = "";

		try {
			inputSentence = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<String> lsWords = Sentence.sentenceToList(inputSentence);
		for (String listElements : lsWords) {
			System.out.println("\'" + listElements + "\'");
		}
		
		//List<String> lWords = Sentence.longestWord(inputSentence);
		Sentence.longestWord(inputSentence);
		
		System.out.print("\tInput nomber of word (from 1 to "+ lsWords.size()+") which will reversed: ");
		int numberWord = 1;
		try {
			numberWord =Integer.parseUnsignedInt( br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print(Sentence.reversWord(inputSentence, numberWord));
		

	}

}
