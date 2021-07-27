package com.Encapsulation;
import java.util.*;
public class SetDemo {
	public static void main(String[] args)
	{
	String str="apple";
	TreeSet<Character> tree=new TreeSet<>();
	for(int i=0;i<str.length();i++)
	{
		tree.add(str.charAt(i));
	}
	String st="";
	for(Object ob:tree)
	{
		st+=ob;
	}
	System.out.println(st);
	}

}
