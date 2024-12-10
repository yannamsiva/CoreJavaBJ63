
public class CalculateDemo {

	int fno;
	int sno;

	int result;

	// addion of two numbers
	void add() {
		fno = 100;
		sno = 200;

		result = fno + sno;
		System.out.println("Fno  : " + fno + "Sno : " + sno);
		System.out.println("Additon of Two Numbers : " + result);
	}

	// subtracting of two numbers
	void sub() {
		
		result = fno - sno;
		System.out.println("Fno  : " + fno + "Sno : " + sno);
		System.out.println("Subtracting of Two Numbers : " + result);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateDemo demo = new CalculateDemo();
		demo.add();
		
demo.fno=500;
demo.sno=300;

		System.out.println("**************************************");
		demo.sub();

	}

}
