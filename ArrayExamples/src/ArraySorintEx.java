
public class ArraySorintEx {

	static void sort(int ar[])// 1,9,90,80,60,100
	{

		for (int i = 0; i < ar.length; ++i) {
			int temp = 0;
			for (int j = 0; j < ar.length - 1; ++j) {
//				//swapping
//				if(ar[i]<ar[j])
//				{
//					temp=ar[i];
//					ar[i]=ar[j];
//					ar[j]=temp;
//				}

				if (ar[j] > ar[j + 1]) {
					temp = ar[j + 1];
					ar[j + 1] = ar[j];
					ar[j] = temp;

				}

			}

		}

		for (int j : ar) {
			System.out.println(j);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 9, 90, 80, 60, 100 };

		sort(arr);
	}

}
