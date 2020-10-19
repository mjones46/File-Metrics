package wordPlay.util;

import wordPlay.util.MetricCalculator;
import wordPlay.util.Results;
import wordPlay.util.Reverse;

import java.lang.String;
import java.lang.StringBuffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceProcessor{
	public static ArrayList<String> allReversed = new ArrayList<String>();
	public static ArrayList<String> allNonReversed = new ArrayList<String>();

	/**
	 This works with the Reverse class complete the output on the file
	 It uses a Stack<Character> pass the word to the WORD_REVERSE function
	 @param aWord	a valid alphanumberic String
	 @return		the reverse of the word
	 */

	public String wordHandler(String aWord){
		Stack<Character> letreverse = new Stack<Character>();
		for(int i = 0; i < aWord.length(); i++){
			letreverse.push(aWord.charAt(i));
		}
		Reverse reversedstring = new Reverse();
		String finalreverse = reversedstring.WORD_REVERSE(letreverse);
		return finalreverse;
	}

	/**
	 This works as a helper function to complete the output on the file
	 It uses a static ArrayList<String> to make the data "global"
	 It passes any actual words to the wordHandler function
	 @param	sentence	the line of data read from the file
	 @return			all the valid input in the file
	 */
	public ArrayList<String> sentenceHandler(String sentence){
		StringBuffer individualWord = new StringBuffer();
		//source:https://stackoverflow.com/questions/31273020/how-to-split-a-string-while-maintaining-whitespace
		//source:https://stackoverflow.com/questions/4674850/converting-a-sentence-string-to-a-string-array-of-words-in-java
		String[] allWords = sentence.split("\\b");
		MetricCalculator metricCalc = new MetricCalculator();
		for(int i = 0; i < allWords.length; i ++){
			SentenceProcessor.allReversed.add(wordHandler(allWords[i]));
		}
		SentenceProcessor.allReversed.add("\n");
		return SentenceProcessor.allReversed;
	}

	/**
	 This works as a helper function to complete the metrics on the file
	 It uses a static ArrayList<String> to make the data "global"
	 @param	sentence	the line of data read from the file
	 @return			all the words in the file lowercased
	 */
	 
	public ArrayList<String> ArrayofWords(String sentence){
		String[] allWords = sentence.split("\\b");
		for(int i = 0; i < allWords.length; i ++){
			SentenceProcessor.allNonReversed.add(wordHandler(allWords[i]));
			if(Pattern.matches("[a-zA-Z0-9]+", allWords[i])){
				SentenceProcessor.allNonReversed.forEach((n) -> n.toLowerCase());
			}
		}
		return SentenceProcessor.allNonReversed;
	}
}
