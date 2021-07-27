package com.Encapsulation;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				sum+=Integer.parseInt(String.valueOf(ch));
			}
		}
		System.out.print(sum);
		

	}

}
