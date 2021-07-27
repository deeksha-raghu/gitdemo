package com.Encapsulation;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class PracCollection {
    public static ArrayList getNames(String input)
    {
    	ArrayList<String> arr=new ArrayList<>();
    	StringTokenizer tok=new StringTokenizer(input,",");
    	while(tok.hasMoreElements())
    	{
    		String str=tok.nextToken();
    		arr.add(str.substring(0,1).toUpperCase()+str.substring(1,str.length()));
    		
    	}
    	return arr;
    	
    }
    public static String Names(String input)
    {
    	String st="\"";
    	StringTokenizer tok=new StringTokenizer(input,",");
    	int len=tok.countTokens(),i=0;
    	while(tok.hasMoreElements())
    	{
    		++i;
    		String str=tok.nextToken();
    		st+=(str.substring(0,1).toUpperCase()+str.substring(1,str.length()));
    		if(i<len)
    		{
    			st+=",";
    		}
    		
    		
    	}
    	st+="\"";
    	return st;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names="ram,rahim,robert,farhan,aditi,reshma,guna";
		System.out.println(getNames(names));
		System.out.println(Names(names));
		

	}

}
