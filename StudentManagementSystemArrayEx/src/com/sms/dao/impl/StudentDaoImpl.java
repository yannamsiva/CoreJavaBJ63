package com.sms.dao.impl;

import java.util.Scanner;

import com.sms.dao.StudentDao;
import com.sms.pojo.Student;

public class StudentDaoImpl implements StudentDao{

	Scanner sc = new Scanner(System.in);
public static Student[]addStudentInfo=null;

	public void addStudents() {
		
		System.out.println("how Many Students Are Joining");
		int size=sc.nextInt();
		addStudentInfo=new Student[size];
		
		for(int i=0;i<size;++i)
		{
		System.out.println("Enter The Student Number ");
		int sno = sc.nextInt();
		System.out.println("Enter The Student Name ");
		String sname = sc.next();
		System.out.println("Enter The Student Address ");
		String sadd = sc.next();
		//store the data inside student object
		//parameterized constructor
		Student student=new Student(sno,sname,sadd);
		addStudentInfo[i]=student;
		System.out.println("AddStudent Success fully");
		}//end of for loop
		
		
		

	}// end of addStudents
	
	
	public Student[] viewAllStudentInfo()
	{
		
		return addStudentInfo;
	}//end of viewallStudentInfo
	
	
	public Student viewStudent(int sno)
	{

if(addStudentInfo!=null)
	
	
		for(Student stu : addStudentInfo)
		{
			if(stu.getSno()==sno)
				return stu;
		}
		
		
		
		return null;
	}//end of viewStudent
	
	
	
	
	

}
