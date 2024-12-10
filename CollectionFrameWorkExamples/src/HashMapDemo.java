import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String>hm=new HashMap<Integer,String>();
hm.put(100,"shiva");
hm.put(101,"rani");	
hm.put(102,"malli");	
hm.put(103,"lilly");	
hm.put(104,"shiva");
hm.put(105,"manisha");
System.out.println(hm);	
	
String name = hm.get(100);
System.out.println(name);





Set<Integer> keySet = hm.keySet();//we can get the keys

for(Integer no : keySet)
{
	System.out.print(no+" ");
}
System.out.println();

Collection<String> values = hm.values();//we can get values

for(String names : values)
{
	System.out.print(names+" ");
}
System.out.println();

Set<Entry<Integer, String>> entrySet = hm.entrySet();//get the entry

for(Entry<Integer,String>e : entrySet)
{
	System.out.println(e.getKey()+"\t"+e.getValue());
}







	}

}
