package com.Encapsulation;

import java.util.Scanner;

public class SalaryException extends Exception {
	public SalaryException(String message)
	{
		super();
	}
	

}
class SalaryRangeException extends Exception {
	public SalaryRangeException(String message)
	{
		super();
	}
	

}
class VerifySalary
{
	public void verifysal(int sal) throws Exception
	{
		if(sal<0)
		{
			throw new SalaryException("Salary cannot be negative");
		}
		else if(sal>50000)
		{
			throw new SalaryRangeException("Salary cannot be above 50000");
		}
		else
		{
			System.out.println("Salary Verified");
		}
	}
}
class Verify
{
	public static void main(String[] args) throws Exception
	{
		VerifySalary vs=new VerifySalary();
		Scanner sc=new Scanner(System.in);
		int sal=sc.nextInt();
		try
		{
			vs.verifysal(sal);
			System.out.println(sal);
		}
		catch(SalaryException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(SalaryRangeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}