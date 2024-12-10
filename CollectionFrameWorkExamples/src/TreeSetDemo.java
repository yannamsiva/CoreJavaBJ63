import java.util.Comparator;
import java.util.TreeSet;

class Comp implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet <Integer>tr=new TreeSet<>(new Comp());
tr.add(100);
tr.add(250);
tr.add(50);
tr.add(5);
System.out.println(tr);


//System.out.println(tr.first());
//System.out.println(tr.last());
//System.out.println(tr.tailSet(50));
//System.out.println(tr.headSet(50));


	}

}
