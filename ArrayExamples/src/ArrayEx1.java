
public class ArrayEx1 {

	static void min(int ar[])//10,20,50,800,900,5
	{
		System.out.println(ar.length);
		int min=ar[0];//5
		
		for(int i=0;i<ar.length;++i)//iterate the elements from the array
		{
			if(min>ar[i])//
			{
				min=ar[i];//5
				
			}
			
			
		}
		
		
		System.out.println("Min Value From the Array :"+min);
		
		
	}
	
	static void max(int ar[])
	{
		
		System.out.println(ar.length);
		int max=ar[0];//5
		
		for(int i=0;i<ar.length;++i)//iterate the elements from the array
		{
			if(max<ar[i])//
			{
				max=ar[i];//5
				
			}
			
			
		}
		
		
		System.out.println("max Value From the Array :"+max);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Annomous Array
		int arr[]= {10,20,50,800,900,5};
		min(arr);
		max(arr);
		
		
		
	}

}
