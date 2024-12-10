import java.util.Scanner;

public class ArrayEx2 {
	
	
	void findEven(int ar[])
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		

		System.out.println("Enter The size of the Array");
		int size=sc.nextInt();
		int ar[]=new int[size];
for(int i=0;i<ar.length;++i)
{
	System.out.println("Enter The Value");
	ar[i]=sc.nextInt();
}

System.out.println("Display Details :");
for(int j=0;j<ar.length;++j)
{
	System.out.println(ar[j]);
}

	}

}
