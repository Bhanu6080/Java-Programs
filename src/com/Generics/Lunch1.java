package com.Generics;

import java.util.ArrayList;
import java.util.Collections;

class Cricketer{
	String name;
	String country;
	int matches;
	int catches;
	int wickets;
	public Cricketer(String name, String country, int matches, int catches, int wickets) {
		super();
		this.name = name;
		this.country = country;
		this.matches = matches;
		this.catches = catches;
		this.wickets = wickets;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public int getMatches() {
		return matches;
	}
	public int getCatches() {
		return catches;
	}
	public int getWickets() {
		return wickets;
	}
	
	
}

public class Lunch1 {
	public static void main(String[] args) {
		Cricketer c1 = new Cricketer("Sachin","India", 400, 300, 200);
		Cricketer c2 = new Cricketer("Warne","USA", 350, 80, 500);
		Cricketer c3 = new Cricketer("Smith","SA", 370, 300, 80);
		
		ArrayList<Cricketer> al = new ArrayList<Cricketer>();
		al.add(c1);
		al.add(c2);		
		al.add(c3);
	 
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(200);
		al1.add(300);		
		al1.add(400);
		al1.add(50);
		
		Collections.sort(al1);
		System.out.println(al1);
		 
		//Collections.sort(al);
		System.out.println(al);
	}

}
