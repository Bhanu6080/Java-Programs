package com.Arrays;

import java.util.Scanner;

public class ArrayDS {
	static int choice;
	static void ops() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the operation to perforn: \n"
				+ "1.Create an Array\n"
				+ "2.Add data into the Array\n"
				+ "3.Display the Array Data\n"
				+ "4.Update the element of an Array\n"
				+ "5.Delete the element of an Array\n"
			    + "6.Exit");
		choice = sc.nextInt();
	}
 
	public static void main(String[] args) {
		
		ArrayOperations ao = new ArrayOperations();
		ops();
		switch (choice) {
		case 1: {
			ao.createArray();
			ops();
			
		}
		case 2: {
			ao.insertIntoArray();
			ops();
			
		}
		case 3: {
			ao.displayArrayData();
			ops();
			
		}
		case 4: {
			ao.updateArrayData();
			ops();
			
		}
		case 5: {
			ao.deleteArrayData();
			ops();
			
		}
		default:
			System.out.println("Unexpected value given: " + choice);
		
		}
		
	}

}
