
public class D {

	int i=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D d=new D();
		System.out.println(d.i);//10
		D d1=d;//assigning referece varible to d1
		System.out.println(d1.i);//10
		d.i=100;
		System.out.println(d.i+"\t"+d1.i);//100 100
		d=new D();
		System.out.println(d.i+"\t"+d1.i);//10 100
		
		
	}

}
