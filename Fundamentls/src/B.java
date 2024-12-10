
public class B {

	int i=100;
	void funB()
	{
		System.out.println("inside funB");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new B().funB();

new B().i=500;

System.out.println(new B().i);//100

	}

}
