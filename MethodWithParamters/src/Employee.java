import java.util.Scanner;

public class Employee {

	int eno;
	String ename;
	
	
	

	public Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
		System.out.println("Parameterized Constructor");
	}

	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("defaultConstructo/No-Argumentbased constructor");
	}
void displayDetails()
{
	System.out.println(eno+"\t"+ename);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee emp=null;
		while(true)
		{
		System.out.println("********************************");
		System.out.println("         1)AddEmployee          ");
		System.out.println("         2)ViewEmployee          ");
		System.out.println("         3)Exit          ");
		System.out.println("********************************");
		System.out.println("Enter The Choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Employee Number");
			int eno=sc.nextInt();
			System.out.println("Enter Employee Name");
			String ename=sc.next();
			 emp=new Employee(eno,ename);
		System.out.println("Employee Information Added Successfully");
		break;
		case 2:
			emp.displayDetails();
			break;
		case 3:
			System.out.println("Thx for Using App!");
			System.exit(0);
			default:
				System.out.println("Choose 1 to 3 Between");
			
		
		
		
		}//end of switch
		
		
		
		
		}//while
		
	}

}
