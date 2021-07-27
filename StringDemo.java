package com.Encapsulation;

import java.util.StringTokenizer;


public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruits= "apple,orange,kiwi,mango,melon";
		String s1="hello";
		s1="hey";
		System.out.println(s1.replace('e','o'));
		StringTokenizer tok=new StringTokenizer(fruits,",");
		while(tok.hasMoreElements())
		{
			System.out.println(tok.nextToken());
		}
		

	}

}
