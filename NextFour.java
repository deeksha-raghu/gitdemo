package com.Encapsulation;
import java.util.Scanner;
public class NextFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String sb="";
		sb=str.substring(0,str.length()-1);
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				sum=Integer.parseInt(String.valueOf(ch));
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(sb+sum);
			sum+=1;
		}

	}

}
