package com.dest.basics.patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int count = n*n;
		for (int i = 1; i <= n; i++) {	
			count = i;
			for (int j = 1; j <= n; j++) {
				if(count < 10) {
					System.out.print("0"+count+" ");
					count = count+n;
				}
				else {
					System.out.print(count+" ");
					count = count+n;
				}
				 
				
		}
		
		System.out.println();
	}
	 

	}

}
