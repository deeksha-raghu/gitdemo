package com.Encapsulation;
import java.util.Scanner;
public class IncreasingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=4321;
       int arr[]=new int[4];
       int i=0;
       while(num!=0)
       {
    	   arr[i++]=num%10;
    	   num/=10;
       }
// 0123
// 1234     
      for(int j=i-1;j>0;j--)
       {
    	   if(arr[j-1]>arr[j]||arr[j-1]==arr[j])
    	   {
    		   continue;
    	   }
    	   else
    	   {
    		   System.out.print("Not an Increasing number");
    		   System.exit(0);
    	   }
       }
       System.out.print("Increasing Number"); 
	} 

}
