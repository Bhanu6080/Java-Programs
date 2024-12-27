package com.collections.arraylists;

import java.util.ArrayList;

public class ArrayListcode1 {
	 public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
		System.out.println(al);
		
		al.add("Bhanu");
		al.add("Prakash");
		al.add(78.98);
		al.add(true);
		
		System.out.println(al);
		
		 
		ArrayList al1 = new ArrayList();
		al1.add(1);
		al1.add(5);
		al1.add(15);
		al1.add(2);
		al1.add(7);
		al1.add(1);
		al1.add(17);	
		
		System.out.println(al1);
		
		al.add(al1);
		
		System.out.println(al);
		
		al.addAll(al1);
		System.out.println(al);
		
		al.addAll(2, al1);
		System.out.println(al);
				
	}
	

}
