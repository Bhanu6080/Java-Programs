package com.strings;

class Calculator {
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	float add( float a,  float b) {
		return a+b;
	}
	float add( float a,  float b, float c) {
		return a+b+c;
	}
	double add( double a,  double b) {
		return a+b;
	}
	double add( double a,  double b, double c) {
		return a+b+c;
	}
	float add( float a,  int b) {
		return a+b;
	}
	float add( int a,  float b) {
		return a+b;
	}
	double add(int a, float b, double c) {
		return a+b+c;
	}
	double add(int a, float b, double c, double d) {
		return a+b+c+d;
	}
	
}

public class MethodOverLoading {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10, 10));
		System.out.println(c.add(10, 10, 20));
		System.out.println(c.add(10.5f, 10.5f));
		System.out.println(c.add(10.5f, 10.5f, 10.3f));
		System.out.println(c.add(10.4556, 10.36546));
		System.out.println(c.add(10.4556, 10.36546, 10.33557));
		System.out.println(c.add(10.5f, 10));
		System.out.println(c.add(10, 10.5f));
		System.out.println(c.add(10, 10.5f, 10.35634));
		System.out.println(c.add(10, 10.5f, 10.35634,10.6545374));
	}

}
