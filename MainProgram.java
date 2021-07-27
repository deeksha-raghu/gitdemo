package com.Encapsulation;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StudentVO svo=null;
	        SetStudentData get=new SetStudentData();
	        svo=get.setStudentData();        
	        DisplayStudent disp=new DisplayStudent();
	        disp.display(svo);

	}

}
