package com.strings;

public class StringBuuferBuilder {

	public static void main(String[] args) {
		 String s1 = new String("Sita");
		 String s2 = new String("Ravana");
		 s1.concat(s2); //direct changes are not reflected
		 s1 =  s1.concat(s2); //External push gets them merged
		 System.out.println(s1);
		 
		 StringBuffer sb1 = new StringBuffer("sita");
		 StringBuffer sb2 = new StringBuffer("Rama");
		 sb1.append(sb2);
		 System.out.println(sb1);
		 
		 StringBuilder sbl1 = new StringBuilder("sita");
		 StringBuilder  sbl2 = new StringBuilder("Rama");
		 sbl1.append(sbl2);
		 System.out.println(sbl1);
		 
		 StringBuilder sbl3 = new StringBuilder("Bhanu");
		 StringBuilder  sbl4 = new StringBuilder("Prakash");
		 sbl3.append(sbl4);
		 System.out.println(sbl3);
		 
		 String s3 = new String("Peddapalyam");
		 String s4 = new String("Bhanu Prakash");
		 s3.concat(s4); //direct changes are not reflected
		 s3 =  s3.concat(s4); //External push gets them merged
		 System.out.println(s3);
		 
		 

	}

}
