package com.caesarcipher;

public class CrackingCaesar {
	
	public final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public void crack(String cipher) {
		for(int i=0; i<ALPHABET.length(); i++) {
			String plain_text = "";
			
			for(int j=0; j<cipher.length(); j++) {
				char character = cipher.charAt(i);
				int charIndex = ALPHABET.indexOf(character);
				
				int decryptedIndex = Math.floorMod(charIndex - i, ALPHABET.length());
				plain_text += ALPHABET.charAt(decryptedIndex);				
			}
			System.out.format("[?] Key: %d => Decrypted Text: %s", i, plain_text);
		}
	}
	
}
