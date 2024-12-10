
public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="SHIVA";
System.out.println(s.toLowerCase());

System.out.println("siva".toUpperCase());

System.out.println("sivasankarareddi".length());

System.out.println("   welcome   ");

System.out.println("   welcome   ".trim());

System.out.println("sivasankara".replace('a','A'));

System.out.println("welcome sivasankara welcome".replaceAll("welcome","java"));
System.out.println("welcome sivasankara welcome".replaceFirst("welcome","java"));

String str="hellow";
//string to Array
char ch[]=str.toCharArray();

for(char c : ch)
	System.out.println(c);

//Array to String

String str1=String.copyValueOf(ch);

System.out.println(str1);

//to convert primtive data types or string or array we can valueOf(primtivedaatype,string,char,...)

System.out.println(String.valueOf(250.25));

System.out.println(String.valueOf(ch));

System.out.println("sivasankarariddy".substring(4));//sankarariddy

System.out.println("sivasankarariddy".substring(4,12));//sankara

System.out.println("javaissimple".substring(4,6));//















	}

}
