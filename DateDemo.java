package com.Encapsulation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		DateFormat form=DateFormat.getDateInstance(DateFormat.LONG,Locale.US);
		String s1=form.format(d);
		
		SimpleDateFormat sim=new SimpleDateFormat("G dd-MM-yyyy");
		String s2=sim.format(d);
		SimpleDateFormat si=new SimpleDateFormat("dd/MM/yyyy");
		String s3=si.format(d);
		
		
		SimpleDateFormat dat=new SimpleDateFormat("EEEE");
		String s="02/06/2000";
		
		
        String var="15-07-2021";
            SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
            Date obj=null;
            try {
				obj=sdf1.parse(var);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           
            SimpleDateFormat sdf2=new SimpleDateFormat("EEEE");
            String dayName=sdf2.format(obj);
            System.out.println(dayName);


	}

}