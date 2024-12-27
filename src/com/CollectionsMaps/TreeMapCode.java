package com.CollectionsMaps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCode {
	public static void main(String[] args) {
		Map<Integer, String> m = new TreeMap<Integer, String>();
		
		m.put(1,  "Bhanu");
		m.put(2,  "Prakash");
		m.put(3,  "Ganesh");
		m.put(4,  "Yogesh");
		m.put(5,  "Karthik");
		
		System.out.println(m);
		System.out.println("=====================");
		m.replace(2,  "Prakash",  "Nithin");
		System.out.println(m);
		System.out.println("=====================");
		m.putIfAbsent(3,  "Ganesh");
		System.out.println(m);
		System.out.println("=====================");
		m.putIfAbsent(9,  "Ganesh");
		System.out.println(m);
		System.out.println("=====================");
		 m.containsValue("Bhanu");
		System.out.println(m);
		System.out.println("=====================");
		
	}
}
