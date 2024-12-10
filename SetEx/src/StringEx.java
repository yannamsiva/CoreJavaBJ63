import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name");
		String uname=sc.next();
		System.out.println("Enter Password");
		String pass=sc.next();
		
		if(uname.equalsIgnoreCase("admin")&&pass.equals("admin123"))
			System.out.println("Valid User");
		else
			System.out.println("In Valid User");
		
		
	}

}
