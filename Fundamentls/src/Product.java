
public class Product {

	int pid;
	String pname;
	void dispDetails()
	{
		pid=100;
		pname="TV";
		System.out.println(pid +"\t"+pname);//100 tv
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product pro=new Product();
System.out.println(pro.pid+"\t"+pro.pname);//0 null
pro.dispDetails();
System.out.println(pro.pid+"\t"+pro.pname);//100 tv




	}

}
