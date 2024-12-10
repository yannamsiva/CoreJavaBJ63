import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student stu=new Student(100,"shiva","hyd");
Student stu1=new Student(101,"shiva","hyd");
Student stu2=new Student(102,"shiva","hyd");
Student stu3=new Student(103,"shiva","hyd");
//adding student information to arraylist
ArrayList<Student>addStudents=new ArrayList<Student>();
addStudents.add(stu);
addStudents.add(stu1);
addStudents.add(stu2);
addStudents.add(stu3);
//display All the Student information
for(Student st :  addStudents)
{
	System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getSadd());
}
	//specific  Student information using student number
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student Number");
int sno=sc.nextInt();
int k=0;
for(Student st :  addStudents)
{
	if(st.getSno()==sno)
	{
	System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getSadd());
	++k;
	}
}
if(k==0)
	System.out.println("Student Record not Exist");

System.out.println("---------------------------------------------");
//Delete Student Information using sno
System.out.println("Enter Student Number");
 sno=sc.nextInt();
k=0;
for(Student st :  addStudents)
{
	if(st.getSno()==sno)
	{
	addStudents.remove(st);
	System.out.println("Student Record Deleted Successfully");
	++k;
	break;
	}
}
if(k==0)
	System.out.println("Student Record not Exist");
System.out.println("---------------------------------------------");
System.out.println("Display ArrayList Information");
for(Student st :  addStudents)
{
	System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getSadd());
	
}
System.out.println("---------------------------------------------");
System.out.println("Update student Information ");	

System.out.println("Enter Student Number");
sno=sc.nextInt();
k=0;
for(Student st :  addStudents)
{
	if(st.getSno()==sno)
	{
      System.out.println("Do You Want update 1)Sname  2) Sadd");
      int choice=sc.nextInt();
      switch(choice)
      {
      case 1:
    	  System.out.println("Enter Student Name");
    	  st.setSname(sc.next());
    	  System.out.println("Student Name Updated Success fully");
    	  break;
      case 2:
    	  System.out.println("Enter Student Address");
    	  st.setSadd(sc.next());
    	  System.out.println("Student Address Updated Success fully");
    	  break;
    	  default:
    		  System.out.println("Choose 1 to 2 Between");
    		  
      }
		
		
		
		++k;
	break;
	}
}
if(k==0)
	System.out.println("Student Record not Exist");

System.out.println("******************************************************");

System.out.println("Display ArrayList Information");
for(Student st :  addStudents)
{
	System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getSadd());
	
}





	
	}

}
