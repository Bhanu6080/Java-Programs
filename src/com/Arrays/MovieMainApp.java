package com.Arrays;

import java.util.Scanner;

public class MovieMainApp {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Language count: ");
		 int lang = sc.nextInt();
		 System.out.println("Enter the Category count: ");
		 int cat = sc.nextInt();
		 System.out.println("Enter the Movie count: ");
		 int mov = sc.nextInt();		 
		 System.out.println("Enter the overall investment: ");
		 long invested_amt = sc.nextLong();
		 
		 MovieOps mo = new MovieOps();
		 mo.createArray(lang, cat, mov);
		 mo.collectAllData(lang, cat, mov);
		 mo.displayAllData(lang, cat, mov);
		 mo.totalRevenue();
		 mo.totalRevenueBasedOnLanguage(lang);
		 mo.checkprofit(invested_amt);
	}
}
