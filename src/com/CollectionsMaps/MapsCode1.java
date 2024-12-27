package com.CollectionsMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsCode1 {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Sachin");
		m.put(20, "Sehwag");
		m.put(3, "GAngully");
		m.put(40, "Laxman");
		m.put(5, "Dravid");
		m.put(60, "Kumble");
		m.put(1, "Zaheer");
		
		System.out.println(m);
		System.out.println("===================");
		System.out.println(m.containsKey(1));
		System.out.println(m.containsKey(9));
		System.out.println("================");
		System.out.println(m.containsValue("Sachin"));
		System.out.println(m.containsValue("Bhanu"));
		System.out.println("=======================");
		for(int i = 0;i<m.size();i++) {
			System.out.println(m.get(i));
		}
		System.out.println("====================");
		System.out.println(m.get(78));
		System.out.println("=============");
		System.out.println(m.getClass());
		System.out.println("====================");
		System.out.println(m.getOrDefault(78, "No data Available"));
		System.out.println(m.getOrDefault(20, "No data Available"));
		System.out.println("======================");
		System.out.println(m.hashCode());
		System.out.println("===================");
		System.out.println(m.isEmpty());
		//m.clear();
		//System.out.println(m.isEmpty());
		System.out.println("=================");
		Set<Integer> set = m.keySet();
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()==true) {
			System.out.println(iterator.next());
		}
		System.out.println("=====================");
		Collection<String>  collection = m.values();
		Iterator<String> iterator1 = collection.iterator();
		while(iterator1.hasNext()==true) {
			System.out.println(iterator1.next());
		}
		System.out.println("==================");
		m.putIfAbsent(20, "sehwag");
		System.out.println(m);
		System.out.println("--------------------");
		m.putIfAbsent(90, "Sachin");
		m.putIfAbsent(18, "Virat");
		m.putIfAbsent(45, "Rohith");
		System.out.println(m);
		System.out.println("=====================");
		String remove =m.remove(18);
		System.out.println(remove);
		System.out.println(m);
		System.out.println("-------------------");
		boolean remove1 = m.remove(20, "Sehwag");
		System.out.println(remove1);
		System.out.println(m);
		System.out.println("-------------------");
		remove1 = m.remove(5, "Sachin");
		System.out.println(remove1);
		System.out.println(m);
		System.out.println("-------------------");
		m.replace(5, "Jadeja");
		System.out.println(m);
	}


}
