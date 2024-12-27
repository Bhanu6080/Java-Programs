package com.FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FHCode3 {
	public static void main(String[] args) throws IOException {
		String input_path = "D:\\FH\\input.txt";
		String output_path = "D:\\FH\\output3.txt";
		
		FileInputStream fis = new FileInputStream(input_path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int temp;
		FileOutputStream fos = new FileOutputStream(output_path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		while((temp = bis.read()) != -1) {
			bos.write(temp);
		}
		bos.close();
		bis.close();
		fos.close();
		fis.close();
	}

}
