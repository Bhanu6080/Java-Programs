package com.Arrays;

import java.util.Scanner;

public class MovieOps {
	public static String arr1[][][];
	public static long arr2[][][];
	public static long arr3[];
	public static  Scanner sc = new Scanner(System.in);
	
	private long overall_revenue;
	private long lang_revenue;
	private int temp = 0;
	 
	public void createArray(int lang, int cat, int mov) {
		 arr1 = new String [lang][cat][mov];
		 System.out.println("Array to collect movie name is ready....");
		 arr2 = new long [lang][cat][mov];
		 System.out.println("Array to collect revenue  is ready....");
		 arr3 = new long [lang];
		 System.out.println("Array to collect language based revenue  is ready....");
		 System.out.println("=========================================");		 	
	}
	
	public void collectAllData(int lang, int cat, int mov) {
		System.out.println(" collecting the required details: ");
		for(int i = 0; i<lang; i++) {
			lang_revenue = 0;
			System.out.println("Inside Lang- "+(i+1));
			for(int j = 0; j<cat; j++) {
				System.out.println("\t Inside cat- "+(j+1));
				for(int k = 0; k<mov; k++) {
					System.out.println("\t\t Enter the name of the movie no- "+(k+1));
					arr1[i][j][k] = sc.next();
					System.out.println("\t\t Enter the revenue mad by the movie no- "+(k+1));
					arr2[i][j][k] = sc.nextLong();
					overall_revenue+=arr2[i][j][k];
					lang_revenue+=arr2[i][j][k];
				}
			}
			arr3[temp] = lang_revenue;
			temp++;
		}
		System.out.println("=========================================");	
	}

	public void displayAllData(int lang, int cat, int mov) {
		System.out.println(" displaying the required details: ");
		for(int i = 0; i<lang; i++) {
			System.out.println("Inside Lang- "+(i+1));
			for(int j = 0; j<cat; j++) {
				System.out.println("\tInside cat- "+(j+1));
				for(int k = 0; k<mov; k++) {
					System.out.println("Name:"+arr1[i][j][k]);
					System.out.println("Revenue:"+arr2[i][j][k]);
					System.out.println("----------------------");
				}
			}
		}
		System.out.println("=========================================");	
	}

	public void totalRevenue() {
		System.out.println("The overall revenue ="+overall_revenue);
		System.out.println("=========================================");		
	}

	public void totalRevenueBasedOnLanguage(int lang) {
		System.out.println("The overall revenue language based: ");
		for(int i=0;i<lang;i++) {
			System.out.println("Language No: "+(i+1)+"="+arr3[i]);
		}
		System.out.println("=========================================");
	}

	public void checkprofit(long invested_amt) {
		System.out.println("checking the profit/loss");
		if(invested_amt > overall_revenue) {
			System.out.println("Yashaswini is under loss of:"+(invested_amt-overall_revenue));
		}
		else {
			System.out.println("Yashaswini is in profit of:"+(overall_revenue-invested_amt));
		}
		System.out.println("=========================================");
		
	}
}