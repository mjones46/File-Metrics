package wordPlay.util;

import wordPlay.util.ExceptionHandle;
import wordPlay.util.MetricCalculator;
import wordPlay.util.Results;
import wordPlay.util.SentenceProcessor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import java.lang.String;
import java.lang.StringBuffer;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileProcessor{
	/**
	 This opens the inputfile and checks its validity, if the file is
	 valid it is processed and the output for the output file and the
	 metric file are generated and written to their resppective location
	 @param	inputfile	the name of the file for input
	 @param	outputfile	the name of the file for output
	 @param	metricfile	the name of the file for metrics
	 @throws			FileNotFoundException
	 @throws			ExceptionHandle(WordHandler)
	 */
	public void inputfileprocessing(String inputfile, String outputfile,String metricfile){
		try{
			File infile = new File(inputfile);
			Scanner linereader = new Scanner(infile);
			linereader.useDelimiter("\\n");
			String filedata = "";
			StringBuffer endinput = new StringBuffer();
			ArrayList<String> finaloutput = new ArrayList<String>();
			ArrayList<String> holder = new ArrayList<String>();
			if(infile.length() != 0L){
				while(linereader.hasNext()){
					SentenceProcessor sentence = new SentenceProcessor();
					String testingthefile = filedata = linereader.next();
					try{
						new ExceptionHandle(filedata);
					}catch(Exception e){
						System.out.println(e.getMessage());
						System.exit(0);
					}finally{
					}
					holder = sentence.ArrayofWords(filedata);
					finaloutput = sentence.sentenceHandler(filedata);
					endinput.append(testingthefile);
				}
				String validinput = endinput.toString().trim();
				if(validinput.charAt(validinput.length()-1) != '.'){
					System.out.println("The file you supplied does not end in a period, a period is required to be the last non whitespace character to be valid.");
					System.exit(0);
				}
				outputfileprocessing(outputfile,finaloutput);
				int words = 0;
				int characters = 0;
				MetricCalculator metricCalc = new MetricCalculator();
				for(int i = 0; i < holder.size(); i++){
					characters = holder.get(i).length() + characters;
					if(Pattern.matches("[a-zA-Z0-9]+", holder.get(i))){
						words++;
					}
				}
				SentenceProcessor sen = new SentenceProcessor();
				holder.replaceAll(n -> sen.wordHandler(n));
				holder.replaceAll(n -> n.trim());
				int periods = Collections.frequency(holder,".");
				for(int i = 0; i < holder.size(); i++){
					if(!Pattern.matches("[a-zA-Z0-9.]+", holder.get(i))){
						holder.remove(holder.get(i));
					}
				}
				Results finalmetrics = new Results();
				String mostFrequentWord = metricCalc.MAX_FREQ_WORD(holder,"",0);
				String longestWord = metricCalc.LONGEST_WORD(holder, "");
				double avgWords = metricCalc.AVG_NUMBER_WORDS_PER_SENTENCE(words, periods);
				double avgChars = metricCalc.AVG_NUM_CHARS_PER_SENTENCE(characters, periods);
				metricsfileprocessing(metricfile,finalmetrics.avgNumWordFile(avgWords),finalmetrics.avgNumCharFile(avgChars),finalmetrics.maxWordFile(mostFrequentWord),finalmetrics.longWordFile(longestWord));
				linereader.close();
			}else{
				System.out.println("The file you supplied is empty, only files with data can be processed.");
				System.exit(0);
			}
		}catch(FileNotFoundException e){
			System.out.println("The file you supplied does not exist, it may be in the wrong folder.");
			System.exit(0);
		}finally{
		}
	}
	
	/**
	 This writes the output data to the file
	 @param	outputfile	the name of the file for reversed words
	 @param	fileOutput	all the reversed words from the file
	 @throws			IOException
	 */
	public void outputfileprocessing(String outputfile, ArrayList<String> finalOutput){
		try{
			FileWriter outfile = new FileWriter(outputfile);
			for(int i = 0; i< finalOutput.size(); i++){
				outfile.write(finalOutput.get(i));
			}
			outfile.close();
		}catch(IOException e){
			System.out.println("The file you provided could not be written too.");
			System.exit(0);
		} finally{
		}
	}
	
	/**
	 This writes the metric data to the file
	 @param	metricsfile		the name of the file for metrics
	 @param	avgwords		the strings from the Results class 
	 @param	avgcharacters	the strings from the Results class
	 @param	max				the strings from the Results class
	 @param	longest			the strings from the Results class
	 @throws				IOException
	 */
	public void metricsfileprocessing(String metricsfile, String avgwords,String avgcharacters, String max, String longest){
		try{
			//source:https://howtodoinjava.com/java/io/java-write-to-file/
			FileWriter metricfile = new FileWriter(metricsfile);
			PrintWriter metricprintfile = new PrintWriter(metricfile);
			metricprintfile.print(avgwords);
			metricprintfile.print("\n");
			metricprintfile.print(avgcharacters);
			metricprintfile.print("\n");
			metricprintfile.print(max);
			metricprintfile.print("\n");
			metricprintfile.print(longest);
			metricprintfile.close();
		}catch(IOException e){
			System.out.println("The file you provided could not be written too.");
			System.exit(0);
		} finally{
		}
	}
}
