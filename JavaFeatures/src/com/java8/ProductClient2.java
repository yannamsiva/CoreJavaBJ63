package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
	List<Product>list=new ArrayList<Product>();
	list.add(new Product(1,"tv",10,25000));
	list.add(new Product(2,"Ac",10,35000));
	list.add(new Product(3,"Cooler",10,28000));
	list.add(new Product(4,"Fan",10,15000));
	list.add(new Product(5,"Bottole",10,90000));
	
	/*
	 * //above 25000 information displaying for(Product p : list) {
	 * 
	 * if(p.getPrice()>25000) {
	 * System.out.println(p.getId()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.
	 * getQty());
	 * 
	 * 
	 * }
	 * 
	 * }
	 */
	/*
	 * //to check condtion Stream<Product> filterRecords =
	 * list.stream().filter((e)->e.getPrice()>25000);
	 * filterRecords.forEach(e->System.out.println(e.getPname()+"\t"+e.getPrice()+
	 * "\t"+e.getQty()));
	 */ 
	 
	
	/*
	 * List<Product> filterRecords =
	 * list.stream().filter((e)->e.getPrice()>25000).collect(Collectors.toList());
	 * filterRecords.forEach(e->System.out.println(e.getPname()+"\t"+e.getPrice()+
	 * "\t"+e.getQty()));
	 */
	
//	list.stream().filter((e)->e.getPrice()>25000).collect(Collectors.toList()).forEach(e->System.out.println(e.getPname()+"\t"+e.getPrice()+"\t"+e.getQty()));
	
	List<Integer> filterRecords = list.stream().filter((e)->e.getPrice()>25000).map((e)->e.getPrice()).collect(Collectors.toList());
	
	filterRecords.forEach(e->System.out.println(e));
	
	
	
	  //Predicate
	  
	  //filter(Predicate p)
	
	
	  
	  
		/*
		 * Stream<Product> filterProducts =
		 * list.stream().filter((p)->p.getPrice()>25000);
		 * 
		 * List<Product> collectedProducts =
		 * filterProducts.collect(Collectors.toList());
		 * collectedProducts.forEach(p->System.out.println(p.getId()+"\t"+p.getPname()+
		 * "\t"+p.getPrice()));
		 */
	  
	  
	  //list.stream().filter((p)->p.getPrice()>25000).collect(Collectors.toList()).forEach(p->System.out.println(p.getId()+"\t"+p.getPname()+"\t"+p.getPrice()));
	  
		/*
		 * Stream<Integer> mapPrices =
		 * list.stream().filter((p)->p.getPrice()>25000).map(p->p.getPrice());
		 * List<Integer> collectPrice = mapPrices.collect(Collectors.toList());
		 * collectPrice.forEach(s->System.out.println(s));
		 */
	  
		/*
		 * list.stream().filter((p)->p.getPrice()>25000).map(p->p.getPname()
		 * ).forEach(System.out::println);
		 * 
		 * long count =
		 * list.stream().filter((p)->p.getPrice()>25000).map(p->p.getPname()).distinct()
		 * .count();
		 * 
		 * System.out.println(count);
		 */
	  
	  
		/*
		 * List<Integer> price = list.stream().filter((p)->p.getPrice()>25000)//filering
		 * data
		 * 
		 * .map(p->p.getPrice())//fetching price .collect(Collectors.toList());
		 * 
		 * price.stream().forEach(p->System.out.println(p));
		 */
	
	
	/*
	 * list.stream().filter(p->p.getPrice()>25000)//filtering data
	 * 
	 * .map(p->p.getPrice())//fetching price .forEach(p->System.out.println(p));
	 */
	
	//Stream<Product> listProducts = list.stream();
	
	/*
	 * listProducts.forEach(p->{ if(p.getPrice()>25000)
	 * System.out.println(p.getId()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.
	 * getQty()); });
	 */
//	listProducts.filter(p->p.getPrice()>25000)
//	.map(p->p.getPname())
//	.forEach(p->System.out.println(p));
//	
//	list.stream().filter(p->p.getPrice()>25000)
//	.map(p->p.getPrice())
//	.forEach(p->System.out.println(p));
//	
	//Product p = listProducts.findFirst().get();
	
	//System.out.println(p.getId()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.getQty());
	
	
	//List<Product> records = listProducts.distinct().filter(p->p.getPrice()>25000).toList();  
	
	//records.forEach(p->System.out.println(p.getId()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.getQty()));
	
	// long count = listProducts.filter(p->p.getPrice()>25000).map(p->p.getPrice()).count();
	//System.out.println(count);
	
	/*
	 * long count2 = listProducts.filter(p->p.getPrice()>25000).count();
	 * System.out.println(count2);
	 */
	
	
	
	
	}

}
