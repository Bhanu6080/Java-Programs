package com.FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FHCode1 {
	public static void main(String[] args) throws IOException {
		String input_path = "D:\\FH\\input.txt";
		String output_path = "D:\\FH\\output1.txt";
		
		FileReader fr = new FileReader(input_path);
		int temp;
		FileWriter fw = new  FileWriter( output_path);
		while((temp = fr.read()) != -1){
			fw.write(temp);
			
		}
		fw.close();
		fr.close();

	}

}
