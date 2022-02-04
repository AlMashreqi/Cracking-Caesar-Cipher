package com.caesarcipher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
	private List<String> words;
	
	public FileProcessor() {
		this.words = new ArrayList<>();
		getData();
	}
	
	private void getData() {
		FileReader fileR = null;
		BufferedReader br = null;
		
		try {
			fileR = new FileReader(new File("src/words.txt"));
			br = new BufferedReader(fileR);
			
			String line = "";
			while((line=br.readLine())!=null) {
				words.add(line.toUpperCase());
			}
			
			fileR.close();
			br.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<String> getWords() {
		return this.words;
	}
}
