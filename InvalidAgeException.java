package com.Encapsulation;

public class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String message)
	{
		super();
	}
}
class VerifyAge
{
	
	public void verify(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Invalid Age");
		}
		System.out.println("Valid Age");
	}

}
class Handle
{
	public static void main(String[] args)
	{
	VerifyAge age=new VerifyAge();
	int ages=21;
	try
	{
		age.verify(ages);
		System.out.println("Success");
	}
	catch(InvalidAgeException e)
	{
		System.out.println(e.getMessage());
	}
	}
}
