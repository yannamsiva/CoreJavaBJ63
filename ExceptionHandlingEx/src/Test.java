import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test implements Cloneable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=100;
int x=0;
try {
	Test t=new Test();
	t.clone();
} catch (CloneNotSupportedException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}


 try {
	x=a/0;
	
} catch (NullPointerException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


System.out.println("Welcome Boss"+x);
		
		

		
	}

}
