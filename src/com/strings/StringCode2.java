package com.strings;

public class StringCode2 {

	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "RAMA";
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
			System.out.println("====================");
			
			String st1 = new String("Rama");
			String st2 = new String("RAMA");
			if(st1.equalsIgnoreCase(st2)==true) {
				System.out.println("Strings are equal");
			}
			else {
				System.out.println("Strings are not equal");
			
		}

	


	}

}
