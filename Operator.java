package com.Encapsulation;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      char ch=sc.next().charAt(0);
      switch(ch)
      {
      case '+':
    	  System.out.print("Result is "+(a+b));
    	  break;
      case '-':
    	  System.out.print("Result is "+(a-b));
    	  break;
      case '*':
    	  System.out.print("Result is "+(a*b));
    	  break;
      case '/':
    	  System.out.print("Result is "+(a/b));
    	  break;
      default:
    	  System.out.print("Invalid Operator");
    	  
    
      }
	}

}
