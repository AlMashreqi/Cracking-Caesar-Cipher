package com.caesarcipher;

import java.util.HashMap;
import java.util.Map;

public class CrackingCeasarFA {
	private FrequencyAnalysis fa;
	
	public CrackingCeasarFA() {
		fa = new FrequencyAnalysis();
	}
	
	public int crack(String ciphy) {
		Map<Character, Integer> letterfreqs = fa.analyze(ciphy);
		Map.Entry<Character, Integer> max = null;
		
		for (Map.Entry<Character, Integer> entry : letterfreqs.entrySet()) {
			if(entry.getValue().compareTo(max.getValue()) > 0)
				max = entry;
		}
		
		char mostFchar = max.getKey();
		
		int approx = Constants.ALPHABET.indexOf(mostFchar) - Constants.ALPHABET.indexOf('E');
		return approx;
	}
}
