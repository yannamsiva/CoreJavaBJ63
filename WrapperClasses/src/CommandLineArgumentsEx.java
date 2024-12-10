
public class CommandLineArgumentsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer sno=Integer.parseInt(args[0]);

String sname=args[1];

double sfee=Double.parseDouble(args[2]);
System.out.println(sno+"\t"+sname+"\t"+sfee);
	}

}
