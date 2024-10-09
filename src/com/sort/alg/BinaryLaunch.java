package com.sort.alg;

import java.util.Scanner;

class BinarySearch {
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
	
	public void binarySearch() {
		System.out.println("Enter the element to be searched: ");
		int ele = sc.nextInt();
		 int first = 0;
		 int last = size-1;
		 while(first<=last) {
			 int mid = (first+last)/2;
			 if(arr[mid]==ele) {
				 System.out.println("Element is found in position number:"+(mid+1));
				 System.exit(0);
			 }
			 else if(arr[mid]>ele) {
				 last = mid-1;				 
			 }
			 else  if(arr[mid]<ele) {
				 first = mid+1;
			 }
		 }
		 System.out.println("Element not found");
	}	
}

public class BinaryLaunch {
	public static void main(String[] args) {
		 BinarySearch bs = new BinarySearch();
		 bs.CreateArray();
		 bs.addElement();
		 bs.binarySearch();
	}
}
