package com.strings;

import java.util.Scanner;

public class SpaceCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
	    String str = sc.nextLine();
	    int spc = 0;
	    for(int i=0;i<str.length();i++) {
	    	if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
	    		spc++;
	    	}
	    	 
	    }
	    System.out.println("Word count is :"+(spc+1));
	    
		
	}

}