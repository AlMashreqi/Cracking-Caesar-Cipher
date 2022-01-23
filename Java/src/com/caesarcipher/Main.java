package com.caesarcipher;

public class Main {
	public static void main(String[] args) {
		CaesarCipher cipher = new CaesarCipher();
		CrackingCaesar ciphy = new CrackingCaesar();
		FrequencyAnalysis analy = new FrequencyAnalysis();
		CrackingCeasarFA cracfa = new CrackingCeasarFA();
		
//		if(args.length < 3 ) {
//			System.out.println("[-]Invalid Args");
//			return;
//		}
//		
		String choice = args[0];
		
		switch(choice) {
			case "-e":
				System.out.println(cipher.encrypt(args[1], Integer.parseInt(args[2])));
				break;
			case "-d":
				System.out.println(cipher.decrypt(args[1], Integer.parseInt(args[2])));
			case "-c":
				ciphy.crack(args[1]);
				break;	
			case "-ac":
				System.out.println(cipher.decrypt(args[1], cracfa.crack(args[1])));
			case "-a":
				analy.showAnalysis(args[1]);				
		}
	}
}
