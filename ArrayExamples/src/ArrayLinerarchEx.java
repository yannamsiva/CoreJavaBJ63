import java.util.Scanner;

public class ArrayLinerarchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {1,5,36,90,54};
Scanner sc=new Scanner(System.in);
System.out.println("Enter The value");
int key=sc.nextInt();

int k=0;
for(int i=0;i<ar.length;++i)
{
	if(ar[i]==key)
	{
		System.out.println("Given Value is Found : "+key);
		++k;
	}
}

if(k==0)
{
	System.out.println("Given Value is Not Found : "+key);
}


	}

}
