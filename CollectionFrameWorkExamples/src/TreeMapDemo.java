import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap <Integer,String>tm=new TreeMap<Integer,String>();

tm.put(100,"shiva");
tm.put(50,"rani");
tm.put(25,"lilly");
tm.put(200,"mali");
System.out.println(tm);

System.out.println(tm.firstKey());
System.out.println(tm.lastKey());
System.out.println(tm.tailMap(50));
System.out.println(tm.headMap(50));
	}

}
