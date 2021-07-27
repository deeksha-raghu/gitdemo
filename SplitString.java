package com.Encapsulation;

public class SplitString {

	public String alphanum(String str)
	{
		String s1="";
		String s2="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				s2+=str.charAt(i);
			}
			else
			{
				s1+=str.charAt(i);
			}
		}
		return s1+s2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitString sp=new SplitString();
		System.out.println(sp.alphanum("do11n21"));

	}

}
