package com.sort.alg;

import java.util.Scanner;

class BubbleSort {
	int size;
	int[] arr;
	Scanner sc = new Scanner(System.in);
	
	public void CreateArray() {
		System.out.println("Enter the array size: ");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Array is created-----");
		System.out.println("----------------------------");			
	}
	
	public void addElements() {
		System.out.println("Collecting array Data: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(" Array is created");
		System.out.println("----------------------------");			 
	}
	
	public void display() {
		System.out.println("The elements inside the array ate: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void sort() {
		 System.out.println("sorting process is initiated----");
		 int temp =0;
		 for(int i=0;i<size;i++) {
			 for(int j=i+1;j<size;j++) {
				 if(arr[i]>arr[j]) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }		
	}	
}

public class BubbleSortAlgo {
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		 bs.CreateArray();
		 bs.addElements();
		 bs.sort();		 
		 bs.display();		 
	}
}
