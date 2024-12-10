class Employee
{}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=100;
		
		int i=b;//implicit casting
		
		int sno=120;
		
		byte s=(byte)sno;//Explicit casting
		
		
		int eno=500;
		
		short e=(short)eno;
		
		System.out.println(e);
		
		
		Test t=new Test();
		
		Object ob=t;
		
		Employee e1=new Employee();
		Object obj1=e;
		
		Employee emp=(Employee)obj1;
		
		
		
		
		
	}

}
