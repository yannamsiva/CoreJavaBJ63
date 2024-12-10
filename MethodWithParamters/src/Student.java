
public class Student {
int sno;
String sname;

Student()
{
	sno=100;
	sname="shiva";
	System.out.println("Default constructor");
}

void display()
{
	System.out.println(sno +"\t"+sname);
}

public static void main(String[]args)
{
	
	Student stu=new Student();
	stu.display();
	
}


}
