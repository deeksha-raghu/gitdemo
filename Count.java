package com.Encapsulation;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="APPOLLO";
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(!map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i),1);
			}
			else
			{
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
		}
		TreeMap<Character,Integer> tree= new TreeMap<>();
		tree.putAll(map);
        System.out.println(tree);
	}

}
