package com.Networking1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram2 {
	public static void main(String[] args) throws Exception{
		Socket csoc = new Socket("192.168.29.191",3000);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		InputStream is = csoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		Scanner sc = new Scanner(System.in);
		String messageToServer;
		String messageFromServer;
		while(true)
		{
			System.out.println("You: ");
			messageToServer = sc.nextLine();
			dos.writeUTF(messageToServer);
			if(messageToServer.equalsIgnoreCase("exit"))
			{
				System.out.println("connection closed by client");
				break;
			}
			messageFromServer = dis.readUTF();
			if(messageFromServer.equalsIgnoreCase("exit"))
			{
				System.out.println("Server disconnected");
				break;
			}
			System.out.println("Server: "+messageFromServer);
		}
		dis.close();
		dos.close();
		csoc.close();
	}
}