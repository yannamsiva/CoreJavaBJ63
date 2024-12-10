package java8;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>al=new ArrayList<>();

al.add(100);
al.add(10);
al.add(1000);
al.add(50);
al.add(365);
al.add(100);

al.stream().forEach(System.out::println);
System.out.println("=======================================");
al.stream().forEach((n)->System.out.println(n));
System.out.println("=======================================");

al.stream().filter(p->p>50).forEach(System.out::println);

System.out.println("=======================================");
//to find out unique elements
al.stream().distinct().forEach(System.out::println);

////to find out how many elements in the list
long count = al.stream().count();
System.out.println(count);







	}

}
