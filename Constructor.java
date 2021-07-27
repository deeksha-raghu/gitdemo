package com.Encapsulation;

import java.util.ArrayList;

public class Constructor {
	int x,y;
	public Constructor()
	{
		x=10;
		y=20;
	}
	public Constructor(int a,int b)
	{
		x=a;
		y=b;
	}
    public void Print()
    {
    	System.out.println(x+y);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor con=new Constructor();
		con.Print();
		Constructor co=new Constructor(10,25);
		co.Print();
		
		

	}

}
