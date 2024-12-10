package com.sms.dao;
import com.sms.pojo.Student;

public interface StudentDao {
	public void addStudents();

	public Student[] viewAllStudentInfo();

	public Student viewStudent(int sno);
}
