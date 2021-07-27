package com.Encapsulation;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
	
		Integer n=new Integer(num);
		System.out.println(n);
		double d=n.doubleValue();
		System.out.println(d);
		int x=n.intValue();
		String str="1000";
		int a=Integer.parseInt(str);
		int number=1000;
		String s1=String.valueOf(number);
		String s2=Integer.toString(number);
		
		Character ch=65;
		int alpha=ch;
		System.out.print(alpha);
		

	}

}
