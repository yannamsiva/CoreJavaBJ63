package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product>productList=new ArrayList<>();
		productList.add(new Product(1,"TV",35000,10));
		
		productList.add(new Product(2,"Pen",25000,10));
		
		productList.add(new Product(3,"Bench",45000,10));
		
		productList.add(new Product(4,"Fan",15000,10));
		
		productList.add(new Product(5,"Cooler",65000,10));
		
		
		productList.add(new Product(6,"AC",20000,10));
		
		
		//for loop
		
		//for each
		//iterator
		//listIterator
		
		productList.stream().forEach(
				
				(p)->
				{
					System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getPrice()+"\t"+p.getQty());
				}
				
				);
		System.out.println("==============================================");
		
productList.stream().filter((pr)->pr.getPrice()>25000).

forEach(
				
				(p)->
				{
					System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getPrice()+"\t"+p.getQty());
				}
				
				);

System.out.println("==============================================");

productList.stream().filter((pr)->pr.getPrice()>25000).map(pm->pm.getPrice()+"\t"+pm.getName()).

forEach(
				
				(p)->
				{
					System.out.println(p);
				}
				
				);
		
		
		
System.out.println("==============================================");

Stream<Integer> map = productList.stream().filter((pr)->pr.getPrice()>25000).map(pm->pm.getPrice());

		List<Integer> collect = map.collect(Collectors.toList());
		
		System.out.println("==============================================");

		productList.stream().filter((pr)->pr.getPrice()>25000).map(pm->pm.getPrice())
		.collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		
	}

}
