package com.Encapsulation;
import java.util.*;

public class StringPractice {
	public boolean vowel(char ch)
	{
		
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			return true;
		}
		return false;
	}
	public String ReturnString(String str)
	{
		String s2="";
		for(int i=0;i<str.length();i++)
		{
			if(!vowel(str.charAt(i)))
			{
				if(str.charAt(i)=='z'||str.charAt(i)=='Z')
                {
	               s2+=(char)(str.charAt(i)-25);
                }
				else
				s2+=(char)(str.charAt(i)+1);
			}
			else
			{
				s2+=str.charAt(i);
			}
		}
		return s2;
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		StringPractice sp=new StringPractice();
		System.out.println(sp.ReturnString("zombie"));
	}

}
