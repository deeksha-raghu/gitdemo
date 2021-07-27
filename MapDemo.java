package com.Encapsulation;
import java.util.*;
import java.util.Map.Entry;
public class MapDemo {
   
	List<String> getStudentNames(Map<String,Integer> input)
	{
		
		List<String> li=new ArrayList<>();
		for(Entry<String, Integer> entry:input.entrySet())
		{
			if(entry.getValue()>70)
			{
				li.add(entry.getKey());
			}
		}
		return li;
	}
	Map<String,String> evaluate(Map<String,Integer> input)
	{
		Map<String,String> result= new HashMap<>();
		for(Entry<String, Integer> entry:input.entrySet())
		{
			if(entry.getValue()>70)
			{
				result.put(entry.getKey(),"PASS");
			}
			else
			{
				result.put(entry.getKey(),"FAIL");
			}
		}
		TreeMap<String,String> tree= new TreeMap<>();
		tree.putAll(result);
		return tree;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> students=new HashMap<>();
		students.put("Hrithik",90);
		students.put("Madhuri",87);
		students.put("Fida",67);
		students.put("Ranauk",56);
		students.put("Karthik",75);
		System.out.println(new MapDemo().getStudentNames(students));
		System.out.println(new MapDemo().evaluate(students));
		
		
		

	}

}
