package com.strings;

import java.util.Scanner;

class VowelOperations {
	Scanner sc = new Scanner(System.in);

        void CountVowelConsonant(String s) {
		int Vowel_Count = 0;
		int Consonant_Count = 0;
		System.out.println("Calculating the vowel and consonant count: ");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
			   s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				Vowel_Count++;
			}
			else {
				Consonant_Count++;
			}
		}
		System.out.println("The vowel count is ="+Vowel_Count);
		System.out.println("The Consonant count is ="+Consonant_Count);
		System.out.println("=========================================");	 
	}

	    void UpperCaseVowels(String s) {
		int upper_Vowel_Count = 0;
		System.out.println("Calculating the upper case vowel count: ");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				upper_Vowel_Count++;
			}
		}
		System.out.println("The upper case vowel count is ="+upper_Vowel_Count);
		System.out.println("=========================================");	 	
	}

	    void LowerCaseVowels(String s) {
		int lower_Vowel_Count = 0;
		System.out.println("Calculating the lower case vowel count: ");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				lower_Vowel_Count++;
			}
		}
		System.out.println("The lower case vowel count is ="+lower_Vowel_Count);
		System.out.println("=========================================");	
	}

	     void replaceAllVowels(String s) {
		 String str_temp ="";
		System.out.println("Replacing  all the vowel  with the special character: ");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
			   s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
			str_temp = str_temp+'@';
			}
			else {
				str_temp = str_temp+s.charAt(i);
			}
		}
		System.out.println("The replaced String is ="+str_temp);		 
		System.out.println("=========================================");		
	}

	     void replaceUpperCaseVowels(String s) {
		 String str_temp ="";
			System.out.println("Replacing  all the upper case vowel  with a special character: ");
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				str_temp = str_temp+'@';
				}
				else {
					str_temp = str_temp+s.charAt(i);
				}
			}
			System.out.println("The replaced String is ="+str_temp);		 
			System.out.println("=========================================");				
	}

	     void replaceLowerCaseVowels(String s) {
		 String str_temp ="";
			System.out.println("Replacing  all the lower case vowel  with a special character: ");
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				str_temp = str_temp+'@';
				}
				else {
					str_temp = str_temp+s.charAt(i);
				}
			}
			System.out.println("The replaced String is ="+str_temp);		 
			System.out.println("=========================================");
	}

	     void indivitualVowels(String s) {
		 String str_temp = "";
		 System.out.println("Replacing indivitual vowel  with an  indivitual special character: ");
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a'||s.charAt(i)=='A') {
				str_temp = str_temp+'@';
				}
				else if(s.charAt(i)=='e'||s.charAt(i)=='E') {
					str_temp = str_temp+'#';
					}
				else if(s.charAt(i)=='i'||s.charAt(i)=='I') {
					str_temp = str_temp+'&';
					}
				else if(s.charAt(i)=='o'||s.charAt(i)=='O') {
					str_temp = str_temp+'*';
					}
				else if(s.charAt(i)=='u'||s.charAt(i)=='U') {
					str_temp = str_temp+'$';
					}
				else {
					str_temp = str_temp+s.charAt(i);
				}	
	}
			System.out.println("The replaced String is ="+str_temp);		 
			System.out.println("=========================================");	
	}
}

public class VowelCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
	    String s = sc.nextLine();
	    
	    VowelOperations vo = new VowelOperations();
	    vo.CountVowelConsonant(s);
	    vo.UpperCaseVowels(s);
	    vo.LowerCaseVowels(s);
	    vo.replaceAllVowels(s);
	    vo.replaceUpperCaseVowels(s);
	    vo.replaceLowerCaseVowels(s);
	    vo.indivitualVowels(s);
	     
	}

}
