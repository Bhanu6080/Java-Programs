package com.Basicprograms;
//using temp
public class GreatestNumber1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int temp, result;
		
		temp = num1>num2 ? num1:num2;
		
		result = temp>num3 ? temp:num3;
		System.out.println(result + " is the greatest");
		
	}


}
