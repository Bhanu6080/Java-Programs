package com.Basicprograms;

import java.util.Scanner;

public class PrimeNumber {
	 static boolean isPrime(int num) {
		 boolean flag = true;
		 for(int i=2;i< num;i++) {
			 if(num%i == 0) {
				 flag = false;
				 break;
			 }
		 }
		 return flag;
	 
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number to be checked :");
		 int num = sc.nextInt();
		 boolean result = isPrime(num);
		 
		 
		 
		   
	 if(result == true) {
		 System.out.println("Given Number is a Prime number");		 	 
	 }
	 else {
		 System.out.println("Given Number is not a Prime number");
	 }

	}
}

