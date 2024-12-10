
public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Every Object having unique Id
		E e=new E();
		
		System.out.println(e);//E@1eb44e46
		E e1=new E();
		System.out.println(e1);
		E e2=e1;
		System.out.println(e2);
		e1=new E();
		System.out.println(e1+"\t"+e2);
		

	}

}
