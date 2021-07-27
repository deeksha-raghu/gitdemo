package com.Encapsulation;
import java.lang.Exception;
public class Exceptionh {
 public static void main(String[] args)
 {
	int a=10;
	try
	{
		int c=a/0;
		System.out.print(c);
		
	}
	catch(ArithmeticException e)
	{
		System.out.print(e.getMessage());
	}
	
}
}