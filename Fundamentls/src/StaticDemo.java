
public class StaticDemo {

	static int i=100;
	static void display()
	{
		System.out.println("Display From Static method");
	}
	
	void funX()
	{
		display();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Directly  : "+i);
display();

System.out.println("Using ClassName  : "+StaticDemo.i);
StaticDemo.display();


StaticDemo demo=new StaticDemo();
System.out.println(demo.i);
demo.display();

StaticDemo demo1=null;
System.out.println(demo1.i);
demo1.display();



	}

}
