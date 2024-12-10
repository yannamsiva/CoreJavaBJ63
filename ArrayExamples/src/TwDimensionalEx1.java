import java.util.Scanner;

public class TwDimensionalEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ar[][]=new int[3][3];
		for(int i=0;i<3;++i)
		{
			for(int j=0;j<3;++j)
			{
				System.out.println("Enter the Value : ");
				ar[i][j]=sc.nextInt();
			}
			
			
			System.out.println();
		}
		
		System.out.println("Display Elements : ");
		
		for(int i=0;i<3;++i)
		{
			int sum=0;
			for(int j=0;j<3;++j)
			{
				System.out.print(ar[i][j]+" ");
				sum+=ar[i][j];
			}
			
			System.out.println(" = "+sum);
			System.out.println();
		}

		
		
		
		
		
		

	}

}
