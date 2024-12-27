package com.collections.Hashset;

import java.util.HashSet;

public class HashsetCode1 {
	public static void main(String[] args) {
		 HashSet<String> h = new HashSet <String>();
		h.add("bhanu");
		h.add("prakash");
		h.add("Nithin");
		System.out.println("Hashset elements: "+ h);
		
		h.add("bhanu");
	
		 System.out.println("List contains bhanu or not:"
                 + h.contains("bhanu"));
		
		 h.remove("prakash");
	        System.out.println("List after removing  prakash:"
	                           + h);
		
	}

}

