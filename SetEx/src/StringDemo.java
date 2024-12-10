
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("siva".length());
		
		System.out.println("siva".charAt(1));
		
		System.out.println("welcomeBosswelcome".replaceAll("welcome","Hello"));
		
		System.out.println("welcomeBosswelcome".replace('w','W'));
		
		System.out.println("sivasankarareddi".substring(4));//sankarareddi
		System.out.println("sivasankarareddi".substring(4,11));//sankarareddi
		System.out.println("      siva           ".trim());
		
		String str="welcome";
		//String convert array format
		char[] charArray = str.toCharArray();
		
		//array to string
		String s = String.copyValueOf(charArray);

		
		
		
		
	}

}
