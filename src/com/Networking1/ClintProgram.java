package com.Networking1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClintProgram {
	public static void main(String[] args) throws Exception{
		Socket csoc = new Socket("192.168.29.191", 3000);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message: ");
		String message = sc.nextLine();
		
		dos.writeUTF(message);
		
		
	}

}
