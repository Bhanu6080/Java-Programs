package com.Arrays;

 
	import java.util.Scanner;

	public class Array2DOps {
		public static String arr[][];
		public Scanner sc = new Scanner(System.in);
		public void createArray(int cls, int stu) {
			arr = new String[cls][stu];	
		}

		public void insertArray( int cls, int stu) {
			 System.out.println("collecting school names");
				 for(int j =0; j<cls; j++) {
					 System.out.println(" Enter the name of class number: "+(j+1));
					 for(int k =0; k<stu; k++) {
						 System.out.println(" Enter the name of student number: "+(k+1)); 
						 arr[j][k] = sc.next();
			 				 
				 }
			 }
				 System.out.println("Data is loaded on to the array.");
				 System.out.println("----------------------------");
		}

		public void displayArray( int cls, int stu) {
			 System.out.println("displaying school names");
				 for(int j =0; j<cls; j++) {
					 System.out.println(" The name of class number: "+(j+1));
					 for(int k =0; k<stu; k++) {
						 System.out.println("  The name of the student number: "+(k+1)+"is="+arr[j][k]);  
				 }
			 }
				 System.out.println("-----------------------------------");
			 		
		}

	}



