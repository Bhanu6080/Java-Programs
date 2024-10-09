package com.strings;

import java.util.Scanner;

class CandidateAadhar {
	String name;
	int age;
	String dob;
	String addr;
	String city;
	String state;
	static String country;
	
	static {
		country = "India";
	}
	
	void Calculate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		name = sc.next();
		System.out.println("Enter the age : ");
		age = sc.nextInt();
		System.out.println("Enter the dob : ");
		dob = sc.next();
		System.out.println("Enter the address : ");
		addr = sc.next();
		System.out.println("Enter the city : ");
		city = sc.next();
		System.out.println("Enter the state : ");
		state = sc.next();
		System.out.println("Enter the country : ");
		country = sc.next();
	}
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(dob);
		System.out.println(addr);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
	}
}
public class Aadhar {
	public static void main(String[] args) {
		CandidateAadhar ca1 = new CandidateAadhar();
		ca1.Calculate();
		ca1.display();
		System.out.println("=========================");
		CandidateAadhar ca2 = new CandidateAadhar();
		ca2.Calculate();
		ca2.display();
		System.out.println("=========================");
		CandidateAadhar ca3 = new CandidateAadhar();
		ca3.Calculate();
		ca3.display();
		System.out.println("=========================");

	}

}
