import java.util.IdentityHashMap;

public class IdentityHashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HashMap hm=new HashMap(); Integer i1=new Integer(10); Integer i2=new
		 * Integer(10); hm.put(i1,"siva"); hm.put(i2,"sirisha");
		 * System.out.println(hm);//{i2=sirisha}
		 */
		
		IdentityHashMap hm=new IdentityHashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		hm.put(i1,"siva");
		hm.put(i2,"sirisha");
		System.out.println(hm);//{i2=sirisha}
	
	
	}

}
