package wordPlay.util;

public interface StdoutDisplayInterface {
	String avgNumWordDisplay(double averageword);
	// to display average amount of words per sentence to System.out
	
	String avgNumCharDisplay(double averagechars);
	// to display average amount of characters per sentence to System.out
	
	String maxWordDisplay(String max);
	// to display most frequent word to System.out
	
	String longWordDisplay(String longest);
	// to display longest word to System.out
}
