
public class Addtion {

	void add(int fno,int sno)
	{
		int result=fno+sno;
		System.out.println("Addtion of two numbers : "+result);
	}
	
	public void display(String name)
	{
		System.out.println("Welcome : "+ name);
	}
	
	int sub(int fno,int sno)
	{
		int result=fno-sno;
		
		return result;
	}
	
	
	Addtion funA()
	{
		Addtion a=new Addtion();
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addtion d=new Addtion();
		d.add(100, 200);

		d.display("shiva");
		
int sub=		d.sub(200, 100);
		System.out.println("Sub Traction of Two numbers : "+sub);
		
		System.out.println();
	}

}
