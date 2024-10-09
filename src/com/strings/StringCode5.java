package com.strings;

public class StringCode5 {

	public static void main(String[] args) {
		String s1 = "rama";
		String s2 = "Rama";
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("Addresses are equal");
		}
		else {
			System.out.println(s1.compareTo(s2));
			System.out.println("Addresses are not equal");
		}
			System.out.println("====================");
			
			String s3 = new String("Rama");
			String s4 = new String("rama");
			if(s3.compareToIgnoreCase(s4)==0) {
				System.out.println("Addresses are equal");
			}
			else {
				System.out.println(s3.compareTo(s4));
				System.out.println("Addresses are not equal");
			
		}

	}

}
