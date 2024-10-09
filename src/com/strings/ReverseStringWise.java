package com.strings;

import java.util.Scanner;

public class ReverseStringWise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
	    String str = sc.nextLine();
	    
	    //counting the total number of words
	    int spc = 0;
	    for(int i=0;i<str.length();i++) {
	    	if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
	    		spc++;
	    	}
	}
	    int wd_cnt = spc+1;
	    
	    //create an array that matches to the count of words
	    String arr[] = new String[wd_cnt];
	    int temp = arr.length-1;
	    
	    //loop the string in reverse direction
	    String temp_String="";
	    for(int i=str.length()-1;i>=0;i--) {
	   	    if(str.charAt(i) != ' ') {
	    		temp_String = temp_String + str.charAt(i);    		
	    	}
	    	else {
	    		arr[temp] = temp_String;
	    		temp--;
	    		temp_String="";
	    	}    	
	    }
	    arr[temp] = temp_String;
	    
	    //printing the reversed string array
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }	    
    }
}
