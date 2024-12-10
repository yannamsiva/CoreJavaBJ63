
public class ArrayBounEx {

	void funX() throws CloneNotSupportedException   
	{
		ArrayBounEx e=new ArrayBounEx();
		e.clone();
		int ar[]= {10,20,30};
		System.out.println(ar[5]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBounEx ae=new ArrayBounEx();
		try {
			ae.funX();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("Welcome Boss");

	}

}
