
public class TwDimensionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[][]=new int[3][3];
System.out.print(ar[0][0]);
System.out.print(ar[0][1]);
System.out.print(ar[0][2]);
System.out.println();
System.out.print(ar[1][0]);
System.out.print(ar[1][1]);
System.out.print(ar[1][2]);
System.out.println();
System.out.print(ar[2][0]);
System.out.print(ar[2][1]);
System.out.print(ar[2][2]);

System.out.println("************************");
for(int i=0;i<3;++i)
{
	for(int j=0;j<3;++j)
	{
		System.out.print(ar[i][j]+" ");
	}
	
	
	System.out.println();
}


	}

}
