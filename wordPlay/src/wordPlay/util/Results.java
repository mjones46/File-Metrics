package wordPlay.util;

import wordPlay.util.SentenceProcessor;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	/**
	 STDOut Version of avgNumWord
	 This function addes AVG_NUMBER_WORDS_PER_SENTENCE and formats the 
	 average
	 @param	averageword	the average amount of words in the file
	 @return			the average words per sentence as a String
	 */
	public String avgNumWordDisplay(double averageword){
		String stringout = String.format("AVG_NUMBER_WORDS_PER_SENTENCE = %.2f" , averageword);
		return stringout;
	}
	
	/**
	 STDOut Version of avgNumChar
	 This function addes AVG_NUMBER_CHARS_PER_SENTENCE and formats the 
	 average
	 @param	averagechars	the average amount of chracters in the file
	 @return				the average characters per sentence as a String
	 */
	public String avgNumCharDisplay(double averagechars){
		String stringout = String.format("AVG_NUM_CHARS_PER_SENTENCE = %.2f" , averagechars);
		return stringout;
	}
	
	/**
	 STDOut Version of maxWord
	 This function addes MAX_FREQ_WORD to the most frequent word
	 @param	max	the word that appears the most in the file
	 @return	the most frequent word as a String
	 */
	public String maxWordDisplay(String max){
		String stringout = ("MAX_FREQ_WORD = " + max);
		return stringout;
	}
	
	/**
	 STDOut Version of longWord
	 This function addes LONGEST_WORD to the word with the most characters
	 @param	longest	the word that has the most characters in the file
	 @return	the longest word as a String
	 */
	public String longWordDisplay(String longest){
		String stringout = ("LONGEST_WORD = " + longest);
		return stringout;
	}
	
	/**
	 File Version of avgNumWord
	 This function addes AVG_NUMBER_WORDS_PER_SENTENCE and formats the 
	 average
	 @param	averageword	the average amount of words in the file
	 @return			the average words per sentence as a String
	 */
	public String avgNumWordFile(double averageword){
		String stringout = String.format("AVG_NUMBER_WORDS_PER_SENTENCE = %.2f" , averageword);
		return stringout;
	}
	
	/**
	 File Version of avgNumChar
	 This function addes AVG_NUMBER_CHARS_PER_SENTENCE and formats the 
	 average
	 @param	averagechars	the average amount of chracters in the file
	 @return				the average characters per sentence as a String
	 */
	public String avgNumCharFile(double averagechars){
		String stringout = String.format("AVG_NUM_CHARS_PER_SENTENCE = %.2f" , averagechars);
		return stringout;
	}
	
	/**
	 File Verson of maxWord
	 This function addes MAX_FREQ_WORD to the most frequent word
	 @param	max	the word that appears the most in the file
	 @return	the most frequent word as a String
	 */
	public String maxWordFile(String max){
		String stringout = ("MAX_FREQ_WORD = " + max);
		return stringout;
	}
	
	/**
	 File Version of longWord
	 This function addes LONGEST_WORD to the word with the most characters
	 @param	longest	the word that has the most characters in the file
	 @return	the longest word as a String
	 */
	public String longWordFile(String longest){
		String stringout = ("LONGEST_WORD = " + longest);
		return stringout;
	}
}
