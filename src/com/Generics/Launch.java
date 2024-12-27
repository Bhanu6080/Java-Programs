package com.Generics;

import java.util.ArrayList;

public class Launch {
	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add("Bhanu");//strings is not permitted
		al.add("n");//char is not permitted
		al.add(true);//Boolean is not permitted
		al.add(567.3f);//Float is not permitted
		al.add(34567.987);//double is not permitted
		al.add(100);
		
		System.out.println(al);
		
		
		
	}

}
