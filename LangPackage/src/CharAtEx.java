
public class CharAtEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// char charAt(int pos)
		
		String s="siva";
		System.out.println(s.charAt(1));
		//Accessing First and Last Chracter
		//firstCharacter
		System.out.println(s.charAt(0));//s
		
		System.out.println(s.charAt(s.length()-1));
		
		//print characters from given string  at Odd Positions
		
		String str="sivasankara";
		for(int i=0;i<str.length();++i)
		{
			if(i%2!=0)
				System.out.println("Char At "+i+ " place "+str.charAt(i));
		}
		
		//counting of freequence of characters
		
		String st="Welcome to Takeo Boot Camp";
		
		int count=0;
		for(int i=0;i<st.length();++i)
		{
			if(st.charAt(i)=='o')
				count++;
		}
		System.out.println("Frequency of o is : "+count);
		
		
		System.out.println("siva".concat("reddy"));
		
		System.out.println("siva".contains(st));
		
		
		
		
		
		
	}

}
