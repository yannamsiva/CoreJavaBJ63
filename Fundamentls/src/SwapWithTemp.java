
public class SwapWithTemp {

	// non-static varibles/Instance varibles
	int fno = 100;
	int sno = 200;
	int temp = 0;

	// non-static Method/Instance Method
	void swapWithTemp() {
		// swapping logic
		System.out.println("Before Swapping :");
		System.out.println("Fno : " + fno + "\t" + "Sno  : " + sno);
		temp = fno;
		fno = sno;
		sno = temp;
		System.out.println("After Swapping :");
		System.out.println("Fno : " + fno + "\t" + "Sno  : " + sno);

	}

	void swapWithOutTemp() {
		// swapping logic
		System.out.println("Before Swapping :");
		System.out.println("Fno : " + fno + "\t" + "Sno  : " + sno);
		fno = fno + sno;
		sno = fno - sno;
		fno = fno - sno;

		System.out.println("After Swapping :");
		System.out.println("Fno : " + fno + "\t" + "Sno  : " + sno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwapWithTemp demo = new SwapWithTemp();
		demo.swapWithTemp();

		System.out.println(" ****************  Wih out Temp Swapping*******");

		demo.swapWithOutTemp();
	}

}
