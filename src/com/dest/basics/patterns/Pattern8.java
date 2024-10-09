package com.dest.basics.patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {		
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(j+" ");
				
		}
		
		System.out.println();
	}


	}

}
