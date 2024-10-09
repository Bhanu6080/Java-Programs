package com.strings;

import java.util.Scanner;

public class PangramCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
	    String s1 = sc.nextLine();
	    s1 = s1.toUpperCase();
	    //int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	    int arr[] = new int[26];
	    for(int i = 0;i<arr.length;i++) {
	    	arr[i] = 0;
	    	
	    }
	    int temp;
	    for(int i = 0;i<s1.length();i++) {
	    temp = s1.charAt(i)-65;
	    arr[temp]=1;
	    }    
	    for(int i = 0;i<arr.length;i++) {
	    	if(arr[i] != 1) {
	    		System.out.println("Not Pangram");
	    		System.exit(0);
	    	}
	    }
	    System.out.println("Pangram");
	}

}
