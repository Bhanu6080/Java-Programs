 ///SERIALIZATION
package com.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer1 implements Serializable{
	String name;
	String country;
	int matches;
	int catches;
	int runs;
	public Cricketer1(String name, String country, int matches, int catches, int runs) {
		super();
		this.name = name;
		this.country = country;
		this.matches = matches;
		this.catches = catches;
		this.runs = runs;
	}
	void disp() {
		System.out.println(name);
		System.out.println(country);
		System.out.println(matches);
		System.out.println(catches);
		System.out.println(runs);
	}
	
}
public class Code2 {
	public static void main(String[] args) throws Exception {
		Cricketer1 c1 = new Cricketer1("Virat","India", 300, 200, 1500);
		c1.disp();
		String path = "D:\\FH\\Cricketer1.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1);
		
	}

}
