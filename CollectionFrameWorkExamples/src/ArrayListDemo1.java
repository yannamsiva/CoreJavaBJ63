import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(100);
		al.add(null);
		al.add(250.25);
		al.add("shiva");

		
		ArrayList al1=new ArrayList();
		al1.add(100);
		al1.add(200);
		System.out.println(" AL := "+ al);
		System.out.println("Al1 := "+al1);
		
		al.addAll(al1);
		System.out.println(" AL := "+ al);
		//al.removeAll(al1);
		//System.out.println(" After RemoveAll := "+ al);
		al.retainAll(al1);
		System.out.println(" After retail all := "+ al);
		
	//converting arraylist to array
		Object[] array = al.toArray();
		for(Object ob : array)
			System.out.println(ob);
		
		
		
		

	}

}
