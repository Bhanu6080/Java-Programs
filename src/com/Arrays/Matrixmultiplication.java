package com.Arrays;

import java.util.Scanner;

class MatrixOps1 {
	
	int arr1[][];
	int arr2[][];
	int res[][];
	Scanner sc = new Scanner(System.in);
	
	public void collectDataForArray1(int[][] m1, int n) {
		 arr1 = m1;
		 System.out.println("Collecting data for array-1");
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<n;j++) {
				 arr1[i][j] = sc.nextInt();
			 }		 
		 }	
	}
	
	public void collectDataForArray2(int[][] m2, int n) {
		 arr2 = m2;
		 System.out.println("Collecting data for array-2");
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<n;j++) {
				 arr2[i][j] = sc.nextInt();
			 }		 
		 }	
	}
	
	public void calculate(int[][] res1, int n) {
		res = res1;
		System.out.println("Calculating the sum....");
		System.out.println();
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<n;j++) {
				 res[i][j] = 0;
				 for(int k=0;k<n;k++) {
				  res[i][j] =  res[i][j] + (arr1[i][k] * arr2[k][j]);
			 }	
				 System.out.println("-----------------");
		 }	
	   }
	}

	public void displayResult(int n) {
		 System.out.println("Displaying the sum: ");
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<n;j++) {
			 System.out.print( res[i][j]+"  ");
	}
			 System.out.println();
 		 }
 }
}

public class Matrixmultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter the array Size: ");
		int n = sc.nextInt();
		
		int m1[][] = new int[n][n];
		int m2[][] = new int[n][n];
		int res[][] = new int[n][n];
		
		MatrixOps1 mo = new MatrixOps1();
		mo.collectDataForArray1(m1,n);
		mo.collectDataForArray2(m2,n);
		mo.calculate(res,n);
		mo.displayResult(n);
	}
}
