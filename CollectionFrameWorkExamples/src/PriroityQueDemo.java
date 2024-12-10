import java.util.Iterator;
import java.util.PriorityQueue;

public class PriroityQueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String>queue=new PriorityQueue<>();
queue.add("shiva");
queue.add("rani");
queue.add("malli");
queue.add("amit");
queue.add("lilly");

System.out.println(queue);
System.out.println("Head of the Element "+queue.element());
System.out.println("Head of the Element "+queue.peek());

Iterator<String> iterator = queue.iterator();
while(iterator.hasNext())
{
	String next = iterator.next();
System.out.println(next);
}

System.out.println(queue.poll());
	
	}

}
