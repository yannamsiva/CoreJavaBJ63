import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add(100);
al.add(200);
al.add(100);
al.add(null);
al.add(250.25);
al.add("shiva");

System.out.println(al);

Object obj=al.get(0);
Integer sno=(Integer)obj;
System.out.println(sno);

System.out.println("******************************************");
for(int i=0;i<al.size();++i)
{
	Object o=al.get(i);
	System.out.println(o);
}
System.out.println("******************************************");

for(Object ob : al)
{
	System.out.println(ob);
}





	}

}
