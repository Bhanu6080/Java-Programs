package com.Arrays;

import java.util.Scanner;

public class ArrayOperations {
	public int arr[];
	Scanner sc = new Scanner(System.in);
	private int size;
	
	
   public void createArray()  {
	   System.out.println("Enter the array size: ");
	   size = sc.nextInt();
	   arr = new int[size];
	   System.out.println("Array is crated: ");
	   System.out.println( "------------");
   }
   public void insertIntoArray()  {
	   System.out.println("Enter the array data: ");
	   size = sc.nextInt();
	   for(int i=0;i<=size;i++) {
		   arr[i] = sc.nextInt();
	   }
	   System.out.println("Data is inserted into the Array: ");
	   System.out.println( "------------");
   }
   public void displayArrayData()  {
	   System.out.println(" The Array data is: ");
	   
	   for(int i=0;i<=size;i++) {
		   System.out.println(arr[i]);
	   }
	   
	   System.out.println( "------------");
   }
    public void updateArrayData() {
    	System.out.println( "Enter the position where the new data has to be replaced: ");
    	int pos = sc.nextInt();
    	if(pos <0 || pos>size) {
    		System.out.println( " Invalid position mentioned");
    	}
    	else {
    		System.out.println( " Enter the new element: ");
    		int ele = sc.nextInt();
    		
    		arr[pos] =ele;
    		System.out.println(  "Data is updated in the Array");
    		System.out.println( "------------");
    		displayArrayData();
    		
    	}
    }
    	public void deleteArrayData() {
   
    
    	
    }
  
}
