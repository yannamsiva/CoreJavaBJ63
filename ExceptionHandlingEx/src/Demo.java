
public class Demo {

	void div()throws ArithmeticException
	{
	
		int result=100/0;
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		try
		{
		d.div();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Its ok lets focus");
	}

}
