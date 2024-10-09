package com.Arrays;

import java.util.Scanner;

public class Array3Dmain {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Array3DOps ao = new Array3DOps();
		 System.out.println("Enter the school count: ");
		 int scl =sc.nextInt();
		 System.out.println("Enter the class count: ");
		 int cls =sc.nextInt();
		 System.out.println("Enter the student in each class: ");
		 int stu =sc.nextInt();
		 ao.createArray(scl, cls, stu);
		 ao.insertArray(scl, cls, stu);
		 ao.displayArray(scl, cls, stu);
	}
}