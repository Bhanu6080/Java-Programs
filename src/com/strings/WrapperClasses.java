package com.strings;

public class WrapperClasses {

	public static void main(String[] args) {
		 byte b = 125;
		 Byte byt = new Byte(b);
		 System.out.println(b);
		 System.out.println(byt);
		 System.out.println("=================");
		 
		 short s = 1250;
		 Short shrt = new Short(s);
		 System.out.println(s);
		 System.out.println(shrt);
		 System.out.println("=================");
		 
		 int i = 125000;
		 Integer intgr = new Integer(i);
		 System.out.println(i);
		 System.out.println(intgr);
		 System.out.println("=================");
		 
		  long l = 12500000l;
		 Long lng = new Long(l);
		 System.out.println(l);
		 System.out.println(lng);
		 System.out.println("=================");
		 
		 char c = 'B';
		 Character ch = new Character(c);
		 System.out.println(c);
		 System.out.println(ch);
		 System.out.println("=================");
		 
		 float f = 12.5f;
		 Float flt = new Float(f);
		 System.out.println(f);
		 System.out.println(flt);
		 System.out.println("=================");

		 double d = 12.546578;
		 Double dobl = new Double(d);
		 System.out.println(d);
		 System.out.println(dobl);
		 System.out.println("=================");
		 
		 boolean bl = true;
		 Boolean boln = new Boolean(bl);
		 System.out.println(bl);
		 System.out.println(boln);
		 System.out.println("=================");
	}

}
