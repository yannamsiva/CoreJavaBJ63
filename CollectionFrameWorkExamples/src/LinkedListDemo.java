import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer>li=new LinkedList<>();
li.add(100);
li.add(200);
li.add(500);
li.add(900);

li.add(1,1000);
for(Integer i : li)
{
	System.out.println(i);
}
System.out.println("***************************************************");

//using iterator read the data forward Direction and we can remove the elements
Iterator<Integer> it=li.iterator();

while(it.hasNext())
{
	Integer next = it.next();
	System.out.println(next);
}
System.out.println("***************************************************");
//using listIterator we can read the data forward direction and backwardDirection we can remove 
//the elements
ListIterator<Integer> lit = li.listIterator();

while(lit.hasNext())
{
	
	Integer next = lit.next();
	System.out.println(next);
}

System.out.println("Read the data backward Direction");
while(lit.hasPrevious())
{
	Integer previous = lit.previous();
	System.out.println(previous);
}







	}

}
