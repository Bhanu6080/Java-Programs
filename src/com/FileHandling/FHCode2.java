package com.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FHCode2 {
	public static void main(String[] args) throws IOException {
		String input_path = "D:\\FH\\input.txt";
		String output_path = "D:\\FH\\output2.txt";
		
		FileReader fr = new FileReader(input_path);
        BufferedReader br = new BufferedReader(fr); 
		int temp;
		FileWriter fw = new  FileWriter( output_path);
		BufferedWriter bw = new BufferedWriter(fw);
		while((temp = br.read()) != -1) {
			bw.write(temp);
		}
		bw.close();
		br.close();
		

	}

}
