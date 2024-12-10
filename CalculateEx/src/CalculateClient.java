import java.util.Scanner;

public class CalculateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CalculateDaoImpl daoImpl = new CalculateDaoImpl();
		int fno = 0;
		int sno = 0;
		while (true) {
			System.out.println("-----------------------------------------------");
			System.out.println("            1)ADD                              ");
			System.out.println("            2)SUB                              ");
			System.out.println("            3)MUL                              ");
			System.out.println("            4)EXIT                              ");

			System.out.println("-----------------------------------------------");
			System.out.println("Enter The Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter First Number");
				fno = sc.nextInt();
				System.out.println("Enter Second Number");
				sno = sc.nextInt();
				daoImpl.add(fno, sno);
				break;
			case 2:
				System.out.println("Enter First Number");
				fno = sc.nextInt();
				System.out.println("Enter Second Number");
				sno = sc.nextInt();
				daoImpl.sub(fno, sno);
				break;
			case 3:
				System.out.println("Enter First Number");
				fno = sc.nextInt();
				System.out.println("Enter Second Number");
				sno = sc.nextInt();

				int result = daoImpl.mul(fno, sno);
				System.out.println("Multiplication of Two Numbers : " + result);
				break;
			case 4:
				System.out.println("Thx for Using App!");
				System.exit(0);
				break;
			default:
				System.out.println("Choose 1 to 4 Between only");

			}

		}
	}

}
