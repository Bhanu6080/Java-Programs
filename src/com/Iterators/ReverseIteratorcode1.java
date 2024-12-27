package com.Iterators;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class ReverseIteratorcode1 {
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
		
		ListIterator<Integer> litr = al.listIterator(al.size());
		while(litr.hasPrevious()==true) {
			System.out.println(litr.previous());	 
		}
		System.out.println("=========================");
		
		PriorityQueue<Integer> pq = new  PriorityQueue<Integer>();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		System.out.println(pq);
		System.out.println("================================");
		
		ArrayList al1 = new ArrayList(pq);
		
		ListIterator<Integer> litr1 = al1.listIterator(al1.size());
		while(litr1.hasPrevious()==true) {
			System.out.println(litr1.previous());	 
		}
		
	}

}
