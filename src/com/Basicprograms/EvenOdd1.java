package com.Basicprograms;

import java.util.Scanner;

//USING BITWISE OPEREATOR
public class EvenOdd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		if (isEven(num)) {
			System.out.println(num + " is" + " Even number");
		} else {
			System.out.println(num + " is" + " Odd number");
		}
	}

	static boolean isEven(int num) {
		return (num & 1) == 0;
	}
}
