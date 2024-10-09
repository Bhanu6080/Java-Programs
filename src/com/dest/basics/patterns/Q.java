package com.dest.basics.patterns;

import java.util.Scanner;

public class Q {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size: ");
		 int n = sc.nextInt();
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n; j++ ) {
				if(j==(n/4) && i!=0 && i!=(n-1) ||
				   j==(3*n/4) && i!=0 && i!=(n-1) ||
				   i==0 && j>=(n/4) && j<=(3*n/4) && j!=(n/4)&& j!=(3*n/4) ||
				   i==(n-1) && j>=(n/4) && j<=(3*n/4) && j!=(n/4)&& j!=(3*n/4) ||
				   i==j && j>=(n/2)) {
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



	