package com.caesarcipher;

import java.util.List;

public class LanguageDetector {
	private FileProcessor fp;
	private List<String> wordsEng;
	
	public LanguageDetector() {
		this.fp = new FileProcessor();
		this.wordsEng = fp.getWords();
	}
	
	public int counr(String text) {
		text = text.toUpperCase();
		
		String[] words = text.split(" ");
		int matches = 0;
		
		for(String s: words)
			if(wordsEng.contains(s))
				matches++;
		
		return matches;
	}
	
	public boolean isEng(String text) {
		int matches = counr(text);
		
		if ((float) matches / text.split(" ").length * 100 >= 60)
			return true;
		
		return false;
	}
}
