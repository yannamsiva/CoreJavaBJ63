package com.sms.details;

import java.util.Scanner;

import com.sms.client.StudentClient;
import com.sms.dao.impl.StudentDaoImpl;
import com.sms.pojo.Student;

public class StudentDetails {

	Scanner sc = new Scanner(System.in);
	StudentDaoImpl daoImpl = new StudentDaoImpl();

	public void stuDetails() {

		while (true) {
			System.out.println("************************************************");
			System.out.println("              1)AddStudents                      ");
			System.out.println("              2)ViewAllStudents                      ");
			System.out.println("              3)viewStudents                      ");
			System.out.println("              4)Back                      ");

			System.out.println("************************************************");
			System.out.println("Enter The Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				daoImpl.addStudents();
				stuDetails();
				break;
			case 2:
				Student[] viewAllStudentInfo = daoImpl.viewAllStudentInfo();

				if(viewAllStudentInfo!=null)
				{
				for (Student stu : viewAllStudentInfo) {
					System.out.println(stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getSadd());
				}
				}//end of if
				else
					System.out.println("Students Info is Empty");
				stuDetails();
				break;

			case 3:
				System.out.println("Enter The Student Number :");
				int sno = sc.nextInt();
				Student viewStudent = daoImpl.viewStudent(sno);
				if (viewStudent != null) {
					System.out.println(
							viewStudent.getSno() + "\t" + viewStudent.getSname() + "\t" + viewStudent.getSadd());
				} else
					System.out.println("Student Record Not found");
				stuDetails();
				break;

			case 4:

				// go back to client
				StudentClient.main(null);

				break;
			default:
				System.out.println("Choose 1 to 4 Between");

			}

		} // end of while

	}// end of studetails
}
