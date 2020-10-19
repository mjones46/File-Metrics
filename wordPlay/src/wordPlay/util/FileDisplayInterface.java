package wordPlay.util;

public interface FileDisplayInterface {
	String avgNumWordFile(double averageword);
	// to display average amount of words per sentence to outputfile
	
	String avgNumCharFile(double averagechars);
	// to display average amount of characters per sentence to outputfile
	
	String maxWordFile(String max);
	// to display most frequent word to outputfile
	
	String longWordFile(String longest);
	// to display longest word to outputfile
}
