package com.softserve.practical.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*-
 * Enter a sentence that contains the words between more than one space. Convert
 * all spaces, consecutive, one. For example, if we introduce the sentence "I    am
 * learning    Java      Core», we have to get the "I'm learning Java Core»
 * 
 * 
 * @author Taras Krasitskyi
 *
 */

public class SpaceConvert {

	public static String removeSpaces(String sentence) {
		String whiteSentence = "";
		List<String> listWords = new ArrayList<String>();
		listWords = Sentence.sentenceToList(sentence);
		for (String listElement : listWords) {
			// System.out.println(listElement+" ");
			whiteSentence += listElement + " ";
		}
		whiteSentence = whiteSentence.trim();
		return whiteSentence;

	}

	public static void main(String[] args) {

		String inputSentence = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\tInput sentence: ");
		try {
			inputSentence = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\'Clean\' sentence: " + SpaceConvert.removeSpaces(inputSentence));
	}

}
