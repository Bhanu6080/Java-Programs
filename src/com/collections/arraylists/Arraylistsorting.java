package com.collections.arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistsorting {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(75);
		al.add(125);
		al.add(50);
		al.add(100);
		al.add(75);
		al.add(200);
		al.add(150);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	}

}
