package com.Inheritance.oops;

class parent {
	private static int accno;
	private static int pin;
	void setData() {
		accno = 111;
		pin = 222;
		
	}
}

class child1 extends parent {
	void setData() {
		accno = 123;
		pin = 345;
		
	}
}
public class InheritanceCode1 {

	public static void main(String[] args) {
	 parent p1 = new parent();
	  p1.setData();
	  child1 c1 = new child1();
	  c1.setData();
	  System.out.println(p1.accno);
	  System.out.println(p1.pin);
	  System.out.println(c1.accno);
	  System.out.println(c1.pin);
	  

	}

}
