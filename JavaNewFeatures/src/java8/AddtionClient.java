package java8;
@FunctionalInterface
interface Addtion
{
	int add(int fno,int sno);
}
public class AddtionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addtion ad=(fno,sno)->{
			
			int result=fno+sno;
			System.out.println("Addtion of two numbers :"+ result);
		return result;	
		};
		
		System.out.println(ad.add(100,200));
		
		
	}

}
