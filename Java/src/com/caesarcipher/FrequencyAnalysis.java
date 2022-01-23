package com.caesarcipher;

import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalysis {
	private String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public Map<Character, Integer> analyze(String text) {
		text = text.toUpperCase();
		
		Map<Character, Integer> freqs = new HashMap<>();
		
		for(int i=0;i<ALPHABET.length();i++)
			freqs.put(ALPHABET.charAt(i), 0);
		
		for(int i=0; i<text.length();i++) {
			char c = text.charAt(i);
			
			if(ALPHABET.indexOf(c) != -1) 
				freqs.put(c, freqs.get(c)+1);
		}
		
		return freqs;
		
	}
	
	public void showAnalysis(String text) {
		Map<Character, Integer> freqs = analyze(text);
		
		for(Map.Entry<Character, Integer> entry : freqs.entrySet())
			System.out.format("[+] Letter: %s => Freqeuncy: %s%n", entry.getKey(), entry.getValue());
	}
}
