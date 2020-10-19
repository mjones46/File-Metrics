package wordPlay.util;

import java.lang.String;
import java.lang.StringBuffer;

import java.util.Stack;

public class Reverse{
	/**
	 This reverses the words in the file by popping them off the stack
	 @param	letreverse	a Stack where the word characters were pushed
	 @return			the reverse of the original word
	 */

	public String WORD_REVERSE(Stack<Character> letreverse){
		StringBuffer toreverse = new StringBuffer();
		while(!letreverse.empty()){
			toreverse.append(letreverse.pop());
		}
		String finalreverse = toreverse.toString();
		return finalreverse;
	}
}
