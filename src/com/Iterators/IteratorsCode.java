package com.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorsCode {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		System.out.println("=============================");
		for(int i =0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("==========================");
		for(Integer i : al) {
			System.out.println(i);
		}
		System.out.println("=======================");
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()==true) {
			System.out.println(itr.next());
		}
		System.out.println("=============================");
		ListIterator<Integer> litr = al.listIterator();
		while(litr.hasNext()==true) {
			System.out.println(litr.next());
		}
		
	}

}
