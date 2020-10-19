package wordPlay.driver;

import wordPlay.util.FileProcessor;
import wordPlay.util.Results;

/** @author Melissa Jones*/
/*I read Javadocs from Oracle (Java 7/8) to complete most of the code 
Source: https://docs.oracle.com/javase/8/docs/api/
Source: https://docs.oracle.com/javase/7/docs/api/*/

public class Driver{
	public static void main(String[] args){
	/* As the build.xml specifies the arguments as argX, in case the
	argument value is not given java takes the default value specified in
	build.xml. To avoid that, below condition is used*/
		if ((args.length != 3) || (args[0].equals("${arg0}")) || (args[1].equals("${arg1}")) || (args[2].equals("${arg2}"))) {
			System.err.println("Error: Incorrect number of arguments. Program accepts 3 arguments.");
			System.exit(0);
		} else {//commandline requirements meet so call FileProcessor
			System.out.println("This assignment is to read input, reverse the word and give metrics about the file.");
			FileProcessor inoutputfile = new FileProcessor();
			inoutputfile.inputfileprocessing(args[0],args[1],args[2]);
		}
	}
}
