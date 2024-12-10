import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class TestThrowEx {

	public static void validate(int age)throws ArithmeticException,IOException,SQLException
	{
		if(age<18)
		{
			throw new ArithmeticException("Person is not Eligible to vote");
		}
		else
		{
			System.out.println("Person is Eligible to vote!");
		}
	}
	
	
	public static void method() throws IOException 
	{

		try {
			validate(10);
		} catch (ArithmeticException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
