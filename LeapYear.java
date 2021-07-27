package com.Encapsulation;
import java.io.*;
public class LeapYear {
public static void LeapYearOrNot(int arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		
	
		if(arr[i]%100==0)
		{
				System.out.println(arr[i]+" Century Year");
		}
		else if(arr[i]%4==0)
		{
			System.out.println(arr[i]+" a leap year");
		}
		else
		{
			System.out.println(arr[i]+" not a leap year");
		} 
		
	}
}
	public static void main(String[] args) {
	int year[]= {2000,2001,2100,1900,2400,1999,2004};
	LeapYearOrNot(year);
		

	}

}
