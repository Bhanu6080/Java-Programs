package com.sort.alg;

import java.util.Scanner;

class LinearSearch {
	int arr[];
	int flag = 0;
	int size;
	Scanner sc = new Scanner(System.in);
	
	public void CreateArray() {
		System.out.println("Enter the array size: ");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Array is Ready");
		System.out.println("----------------------------");	
	}
	
	public void addElement() {
		System.out.println("Adding element into the Array: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are added");
		System.out.println("----------------------------");		
	}
	
	public void linearSearch() {
		System.out.println("Enter the element to be searched: ");
		int ele = sc.nextInt();
		for(int i=0;i<size;i++) {
			if(arr[i] == ele) {
				System.out.println("Element found in position no: "+(i+1));
				flag++;
			}
		}
		if(flag<=0) {
			System.out.println("Element not found");			
		}		
	}	
}

public class LinearLaunch {
	public static void main(String[] args) {
		 LinearSearch ls = new LinearSearch();
		 ls.CreateArray();
		 ls.addElement();
		 ls.linearSearch();
	}
}

 