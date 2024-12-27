package com.Generics;

import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable <Cricketer1>{

	String name;
	String country;
	int matches;
	int catches;
	int wickets;
	public Cricketer1(String name, String country, int matches, int catches, int wickets) {
		super();
		this.name = name;
		this.country = country;
		this.matches = matches;
		this.catches = catches;
		this.wickets = wickets;
	}
	
	@Override
	public String toString() {
		return name+"--"+country+"--"+matches+"--"+catches+"--"+wickets;	
	}
	
	@Override
	public int compareTo(Cricketer1 x) {
		 if(this.matches > x.matches) {
			 return 1;
		 }
		 else {
			 return -1; 
		 }	 
	}	
}

public class ComparableInterface {
	public static void main(String[] args) {
		
		Cricketer1 c1 = new Cricketer1("Sachin","India", 400, 300, 200);
		Cricketer1 c2 = new Cricketer1("Warne","USA", 350, 80, 500);
		Cricketer1 c3 = new Cricketer1("Smith","SA", 370, 300, 80);
		
		ArrayList<Cricketer1> al = new ArrayList<Cricketer1>();
		al.add(c1);
		al.add(c2);		
		al.add(c3);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println("=================");
		System.out.println(al);
		
	}
	

}
