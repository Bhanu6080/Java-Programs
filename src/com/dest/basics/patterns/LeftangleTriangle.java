package com.dest.basics.patterns;

import java.util.Scanner;

public class LeftangleTriangle {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size: ");
		 int n = sc.nextInt();
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n; j++ ) {
				if(i==(n-1) || i+j==(n-1) || j==(n-1)) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
			}
		
		}
			System.out.println();

		}
	



	}

}
