package com.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer2 {
	String name;
	String country;
	int matches;
	int catches;
	int wickets;
	public Cricketer2(String name, String country, int matches, int catches, int wickets) {
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
}
class Alpha implements Comparator <Cricketer2> {

	@Override
	public int compare(Cricketer2 x, Cricketer2 y) {
		 if(x.matches > y.matches) {
			 return 1;
		 }
		 else {
			 return -1; 
		 }	 
	}	
}

public class ComparatorInterface {
	public static void main(String[] args) {
		
		Cricketer2 c1 = new Cricketer2("Sachin","India", 400, 300, 200);
		Cricketer2 c2 = new Cricketer2("Warne","USA", 350, 80, 500);
		Cricketer2 c3 = new Cricketer2("Smith","SA", 370, 300, 80);
		
		Alpha alp = new Alpha();
		
		
		ArrayList<Cricketer2> al = new ArrayList<Cricketer2>();
		al.add(c1);
		al.add(c2);		
		al.add(c3);
		System.out.println(al);
		Collections.sort(al, alp);
		System.out.println("==================");
		System.out.println(al);
		
		
	}

}
