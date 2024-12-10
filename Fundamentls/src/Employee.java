
public class Employee {
	
	//non-static varibles/Instance Varibles
	int eno;
	String ename;
	double esal;
	
	char ch='s';
	boolean flag=true;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp=new Employee();
		
System.out.println(emp.eno+" "+emp.ename+" "+emp.esal+" "+emp.ch
		+" "+emp.flag);		
		
		emp.eno=1000;
		emp.ename="shiva";
		emp.esal=85000;
		
System.out.println(emp.eno+"\t "+emp.ename+"\t"+emp.esal);		
		
	}

}
