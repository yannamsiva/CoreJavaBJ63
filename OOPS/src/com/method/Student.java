package com.method;

public class Student {

	void stuDetails(int sno,String sname)
	{
		System.out.println(sno+"\t"+sname);
	}
	
	void stuDetails(String city,double sal)
	{
		System.out.println(city+"\t"+sal);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.stuDetails("Hyd", 250.25);
		
	}

}
