
public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]=new int[3];
System.out.println(ar[0]);
System.out.println(ar[1]);
System.out.println(ar[2]);
//System.out.println(ar[3]);//ArrayIndexOutOfBoundsException
ar[0]=500;
ar[1]=250;
ar[2]=150;
System.out.println(ar[0]);
System.out.println(ar[1]);
System.out.println(ar[2]);
System.out.println("--------------------------------------------");
for(int i=0;i<ar.length;++i)
{
	System.out.println(ar[i]);
}

	
	
	}

}
