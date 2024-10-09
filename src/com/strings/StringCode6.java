package com.strings;

public class StringCode6 {

	public static void main(String[] args) {
		 String s1 = "RajaRamMohanRoy";
		 System.out.println("Original String:"+s1);
		 System.out.println("UpperCase:"+s1.toUpperCase());
		 System.out.println("LowerCase:"+s1.toLowerCase());
		 System.out.println(s1.startsWith("Raja"));
		 System.out.println(s1.startsWith("Roja"));
		 System.out.println(s1.endsWith("Roy"));
		 System.out.println(s1.endsWith("Boy"));
		 System.out.println(s1.contains("Mohan"));
		 System.out.println(s1.contains("Rohan"));
		 System.out.println(s1.getClass());
		 System.out.println(s1. charAt(5));
		// System.out.println(s1. charAt(50));
		 System.out.println(s1.concat(s1));
		 System.out.println(s1);
		 System.out.println(s1.hashCode());
		 System.out.println(s1.indexOf('a'));
		 System.out.println(s1.indexOf('z'));
		 String s2 = "       ";
		 System.out.println(s2.isBlank());
		 System.out.println(s2.isEmpty());
		 System.out.println(s1.lastIndexOf('a'));
		 System.out.println(s1.length());
		 System.out.println(s1. replace('a','$'));
		 
	}

}
