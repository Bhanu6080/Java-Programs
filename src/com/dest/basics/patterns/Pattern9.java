package com.dest.basics.patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of n: ");
	int n = sc.nextInt();
	for(int i = 1; i <= n; i++) {
		for (int j = 1; j <= 2*i; j++) {
			System.out.print(j+" ");
			
		}
	System.out.println();
	}
	
	

	}

}
