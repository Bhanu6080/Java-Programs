package com.sort.alg;

import java.util.Scanner;

class QuickSort {
	 
	public void quicksort(int[] arr, int start,int end) {
		if(start < end) {
			int pivot = partition(arr,start,end);
			quicksort(arr,start,pivot-1);
			quicksort(arr,pivot+1,end);
		}
	}

	private int partition(int[] arr, int start, int end) {
		 int pivot = arr[end];
		 int i = start-1;
		 
		 for(int j=start; j<=end-1;j++) {
			 if(arr[j] < pivot ) {
				 i++;
				 int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
			 }
		 }
		 
		 int temp = arr[i+1];
		 arr[i+1] = arr[end];
		 arr[end] = temp;
		 
		 return (i+1);
	}
	
	
}
class ArrayOps {
	 int arr[];
	 int size;
	 Scanner sc = new Scanner(System.in);
		
		public void CreateArray() {
			System.out.println("Enter the array size: ");
			size = sc.nextInt();
			arr = new int[size];
			System.out.println("Array is Ready");
			System.out.println("----------------------------");	
		}
		public void collectArrayData() {
			System.out.println("Collecting array Data: ");
			for(int i=0;i<size;i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(" Array data is collected");
			System.out.println("----------------------------");			 
		}
		
		public void display() {
			System.out.println("Array elements are: ");
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("----------------------------");	
		}
		
		void sorting() {
			QuickSort qc = new QuickSort();
			qc.quicksort(arr,0,size-1);
		}
		
 }
public class QuckSortAlgo {
	public static void main(String[] args) {
		ArrayOps ao = new ArrayOps();
		ao.CreateArray();
		ao.collectArrayData();
		System.out.println("Before sorting");
		ao.display();
		ao.sorting();
		System.out.println("After sorting");
		ao.display();
	}

}
