package java8;
@FunctionalInterface
interface X
{
	void funX();
}
//interface method should implement in subclass if not implement subclass define as abstract class
//interface Object can not instantiate

//using annomus class we can instantiate interface
public class ClientX  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
X x=new X()
{
	public void funX() {
		// TODO Auto-generated method stub
		System.out.println("funX");
	}
};

x.funX();
	}

	

}
