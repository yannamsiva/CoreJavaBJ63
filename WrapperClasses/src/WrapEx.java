
public class WrapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer i=new Integer(100);
//wrapper class object convert primtive type
int sno=i.intValue();
System.out.println(sno);

Integer i1=new Integer("shiva");//NumberFormatException
System.out.println(i1);

	}

}
