package com.Encapsulation;

public class Overload {
	public static int display(int a,int b)
	{
		if(a>b)
			return a;
		else 
			return b;
	}
	public static double display(double a,double b)
	{
		if(a>b)
			return a;
		else 
			return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(display(3,5));
       System.out.println(display(3.0,5.0));
	}

}
