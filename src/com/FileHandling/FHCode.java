package com.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FHCode {
	public static void main(String[] args) throws IOException {
		String input_path = "D:\\FH\\input.txt";
		String output_path = "D:\\FH\\output.txt";
		
		FileInputStream fis = new FileInputStream(input_path);
		int temp;
		FileOutputStream fos = new  FileOutputStream(output_path );
		
		while((temp = fis.read()) != -1) {
			fos.write(temp);
		}
		fos.close();
		fis.close();

		
	}

}
