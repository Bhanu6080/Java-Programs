package com.Basicprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the year");
		 int n = sc.nextInt();
		 boolean result = leapYear(n);
		 System.out.println(result);
		
	}

	 static boolean leapYear(int n) {
		 if(n%4 == 0) {
			 if(n%100 == 0) {
				 if(n%400 == 0) {
					 return true;
				 }
				 else {
					 return false;
				 }
			 }
			 else {
				 return false;
			 }
		 }
		 else {
			 return false;
		 }
	}

}
