package wordPlay.util;

import java.lang.String;

import java.util.ArrayList;
import java.util.Collections;

public class MetricCalculator{
	
	/**
	 This calculates the average of words to periods
	 @param	words		number of words in the file
	 @param	periods		number of periods in the file
	 @return			the average of words to periods
	 */
	public double AVG_NUMBER_WORDS_PER_SENTENCE(int words,int periods){
		double avgnumword = (double)words/periods;
		return avgnumword;
	}
	
	/**
	 This calculates the average of characters to periods
	 @param	characters	number of characters in the file
	 @param	periods		number of periods in the file
	 @return			the average of the two integers
	 */
	public double AVG_NUM_CHARS_PER_SENTENCE(int characters,int periods){
		double avgnumchars = (double)characters/periods;
		return avgnumchars;
	}
	
	/**
	 This searches through all the words in the file and returns the 
	 most frequent word by comparing all the String frequency
	 @param	wordCollection	all the valid words in the file
	 @param	maxfreq			any String, may or may not be the most frequent
	 @param	freq			the amount of time the maxfreq appears
	 @return				any String that has the highest frequency
	 */
	public String MAX_FREQ_WORD(ArrayList<String> wordCollection, String maxfreq, int freq){
		for(int i = 0; i < wordCollection.size(); i ++){
			if(freq < Collections.frequency(wordCollection, wordCollection.get(i))){
				freq = Collections.frequency(wordCollection, wordCollection.get(i));
				maxfreq = wordCollection.get(i);
			}
		}
		return maxfreq;
	}
	
	/**
	 This searches through all the words in the file and returns the 
	 longest word by comparing all the String lengths
	 @param	wordCollection	all the valid words in the file
	 @param	longestword		any String, may or may not be the longest
	 @return				any String with the most characters
	 */
	public String LONGEST_WORD(ArrayList<String> wordCollection, String longestword){
		for(int i = 0; i < wordCollection.size(); i ++){
			if(longestword.length() <= wordCollection.get(i).length()){
				longestword = wordCollection.get(i);
			}
		}
		return longestword;
	}
}
