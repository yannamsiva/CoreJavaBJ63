import java.util.Scanner;

public class ValidEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Email");
String email=sc.next();
System.out.println("Enter PassWord");
String pass=sc.next();

if(email.equalsIgnoreCase("yannamsiva@gmail.com")&&pass.equals("Admin@123"))
	System.out.println("Valid User");
else
	System.out.println("In Valid User");

		
	}

}
