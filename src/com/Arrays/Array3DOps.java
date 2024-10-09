package com.Arrays;

import java.util.Scanner;

public class Array3DOps {
	public static String arr[][][];
	public Scanner sc = new Scanner(System.in);
	
	public void createArray(int scl, int cls, int stu) {
		arr = new String[scl][cls][stu];	
	}

	public void insertArray(int scl, int cls, int stu) {
		 System.out.println("collecting school names");
		 for(int i =0; i<scl; i++) {
			 System.out.println("Inside the school number : "+(i+1));
			 for(int j =0; j<cls; j++) {
				 System.out.println(" Enter the name of class number: "+(j+1));
				 for(int k =0; k<stu; k++) {
					 System.out.println(" Enter the name of student number: "+(k+1)); 
					 arr[i][j][k] = sc.next();
		 }
			 
			 }
		         }
			 System.out.println("Data is loaded on to the array.");
			 System.out.println("----------------------------");
	}

	public void displayArray(int scl, int cls, int stu) {
		 System.out.println("displaying school names");
		 for(int i =0; i<scl; i++) {
			 System.out.println("The school number : "+(i+1));
			 for(int j =0; j<cls; j++) {
				 System.out.println(" The name of class number: "+(j+1));
				 for(int k =0; k<stu; k++) {
					 System.out.println("  The name of the student number: "+(k+1)+"is="+arr[i][j][k]); 
					 
		 }
			 
			 }
		         }
			 System.out.println("-----------------------------------");
		 
		
	}
}

