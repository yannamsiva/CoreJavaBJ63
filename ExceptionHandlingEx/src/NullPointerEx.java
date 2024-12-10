
public class NullPointerEx {

	int i=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NullPointerEx n=null;
try {
	System.out.println(n.i);
	//open db connection
	//insert query insert data into the database
	
} 

catch (ArithmeticException | NullPointerException e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
	//exception handle by catch block
	System.out.println(e.getMessage());
	
}

finally
{
	System.out.println("To perform Clean up Operations");
}


System.out.println("Welcome Boss");

	}

}
