package com.PriorityQueue;

 
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueCode1 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(10);
		pq.add(40);
		pq.add(100);
		pq.add(80);
		pq.add(300);
		pq.add(450);
		pq.add(270);
		pq.add(830);
		pq.add(30);
		pq.add(90);
		System.out.println(pq);
		
		ArrayList al = new ArrayList(pq);
		
		Collections.sort(al);
		System.out.println(al);
	}

}
