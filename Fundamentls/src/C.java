
public class C {
	//Non-static varibles/instance varibles
	int i=100;
	int j=200;
	int k;
	void funC()
	{
		//Local varibles
		int i=900;
		int j=800;
		//intialization of k
		k=80;
		System.out.println(i);//900
		System.out.println(j);//800
		System.out.println(k);//80
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c=new C();
c.funC();
System.out.println(c.i);//100
System.out.println(c.j);//200
System.out.println(c.k);//80

	}

}
