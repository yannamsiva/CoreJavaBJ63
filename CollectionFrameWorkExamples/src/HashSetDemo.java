import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs=new HashSet();
hs.add(100);
hs.add("shiva");
hs.add(250.25);
hs.add(null);
hs.add(100);
System.out.println(hs);

for(Object obj : hs)
{
	System.out.println(obj);
}
System.out.println("*************************************************");
Iterator iterator = hs.iterator();
while(iterator.hasNext())
{
	Object next = iterator.next();
System.out.println(next);
}


	}

}
