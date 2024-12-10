
public class A {
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
	System.out.println("finalize method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A b=new A();

b=null;
System.gc();
b=new A();
try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

System.out.println("Execution is done");


	}

}
