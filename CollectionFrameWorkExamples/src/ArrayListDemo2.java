import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>al=new ArrayList<Integer>();
al.add(100);
al.add(200);
al.add(100);
al.add(900);
al.add(250);
System.out.println(al);
Integer sno = al.get(0);
System.out.println(sno);
System.out.println("********************************************");
Collections.sort(al);

for(Integer i : al)
{
	System.out.println(i);
}


	}

}
