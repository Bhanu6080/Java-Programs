package com.strings;

public class StringCode3 {

	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Rama";
		if(s1==s2) {
			System.out.println("Addresses are equal");
		}
		else {
			System.out.println("Addresses are not equal");
		}
			System.out.println("====================");
			
			String s3 = new String("Rama");
			String s4 = new String("Rama");
			if(s3==s4) {
				System.out.println("Addresses are equal");
			}
			else {
				System.out.println("Addresses are not equal");
			
		}

	}

}
