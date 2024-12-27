///WITHOUT SERIALIZATION AND DE-SERIALIZATION

package com.Serialization;

class Cricketer{
	String name;
	String country;
	int matches;
	int catches;
	int runs;
	public Cricketer(String name, String country, int matches, int catches, int runs) {
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
public class Code1 {
	public static void main(String[] args) {
		Cricketer c1 = new Cricketer("Bhanu","India", 45, 75, 400);
		c1.disp();
		
	}

}
