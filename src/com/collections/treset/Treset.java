package com.collections.treset;

import java.util.TreeSet;

public class Treset {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(20);
		t.add(30);
		
		System.out.println(t);
		
		TreeSet t1 = new TreeSet();
		t1.add("Bhanu");
		t1.add("Prakash");
		System.out.println(t1);
		t.addAll(t1);
		 
		 
		
		System.out.println(t);
		 
		
				
	}
 
}
