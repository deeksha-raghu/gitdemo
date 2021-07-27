package com.Encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
  
		// TODO Auto-generated method stub
		/*int x=100;
		long y=x;
		//System.out.println(y);  // IMPLICIT
		float f=45.67F;
		int num=(int) f;
		//System.out.println(num); //EXPLICIT
		double d =3456.4567D;
		float dec=(float) d;
		//System.out.println(dec);//EXPLICIT
		 String s1="Helloo World";

         System.out.println(s1.charAt(0));

         String s2="Ant";
         String s3="    ant";
         System.out.println(s2.compareTo(s3)); //0
         System.out.println(s2.equalsIgnoreCase(s3)); //1
         System.out.println(s1.indexOf('o')); //
         System.out.println(s1.lastIndexOf('o'));
         System.out.println(s1.length());
         System.out.println(s2.concat(" Man"));
         System.out.println(s1.replace('o','a'));
         System.out.println(s1.substring(4));
         System.out.println(s1.substring(4,7));
         System.out.println(s3.trim());

         s2.replace('t', 'd'); // IMMUTABLE
         System.out.println(s2); */
		private int empno;
	    private String name;
	    private int age;
	    public Employee(int empno, String name, int age) {
	        super();
	        this.empno = empno;
	        this.name = name;
	        this.age = age;
	    }


	    @Override
	    public String toString() {
	        return "Employee [empno=" + empno + ", name=" + name + ", age=" + age + "]";
	    }
	 

	    public int getEmpno() {
	        return empno;
	    }
	    public void setEmpno(int empno) {
	        this.empno = empno;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	 
	}
	class SortByID implements Comparator<Employee>
	{
	 
	    @Override
	    public int compare(Employee o1, Employee o2) {

	        return o1.getEmpno()-o2.getEmpno();
	    }    
	}
	class SortByName implements Comparator<Employee>
	{
	 
	    @Override
	    public int compare(Employee o1, Employee o2) {

	        return o1.getName().compareTo(o2.getName());
	    }

	}
	class ListDemos 
	{
	public static void main(String[] args) 
	{
	        List<Employee> empList=new ArrayList<Employee>();
	        Employee e1=new Employee(101, "Bunny", 19);
	        Employee e2=new Employee(100,"Pappu",21);
	        Employee e3=new Employee(102, "Akil", 20);

	        empList.add(e1);
	        empList.add(e2);
	        empList.add(e3);

	        Collections.sort(empList,new SortByName());
	        Collections.sort(empList,new Comparator<Employee>() 
	        {
	 
	            @Override
	            public int compare(Employee o1, Employee o2) {
	                // TODO Auto-generated method stub
	                return o1.getEmpno()-o2.getEmpno();
	            }
	        });

	        for(Employee e : empList)
	        {
	            System.out.println(e);
	        }


	}

}
