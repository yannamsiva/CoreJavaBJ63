package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductClient3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> p = new ArrayList<Product>();
		p.add(new Product(1, "Ac", 20, 2000));
		p.add(new Product(2, "Ac", 20, 5000));
		p.add(new Product(3, "Ac", 20, 10000));
		p.add(new Product(4, "Ac", 20, 55000));
		p.add(new Product(5, "Ac", 20, 65000));
		p.add(new Product(6, "Ac", 20, 55000));
//Adding Product
//for loop
//for()
//Iterate
///ListIterator
//Stream<Product> st = p.stream();
//Stream<Product> filr = st.filter(pr->pr.getPrice()>20000);
//filr.forEach(s->System.out.println(s.getId()+"\t"+s.getPname()+"\t"+s.getPrice()+"\t"+s.getQty()));

		/*
		 * List<Product> products =
		 * p.stream().filter(pr->pr.getPrice()>25000).collect(Collectors.toList());
		 * products.forEach(pr->System.out.println(pr.getId()+"\t"+pr.getPname()+"\t"+pr
		 * .getPrice()+"\t"+pr.getPrice()));
		 */

		/*
		 * List<Integer> c =
		 * p.stream().filter(pr->pr.getPrice()>25000).map(pr->pr.getPrice()).collect(
		 * Collectors.toList());
		 * 
		 * System.out.println(c);
		 * 
		 * c.forEach(System.out::println);
		 * 
		 * long count = p.stream().count(); System.out.println(count);
		 */

		/*
		 * Map<Integer,String> pMap=p.stream().collect(Collectors.toMap(pr->pr.getId(),
		 * pr->pr.getPname()));
		 * 
		 * System.out.println(pMap);
		 */

		List<Integer> productPrices = p.stream().filter(pr -> pr.getPrice() > 25000).map(Product::getPrice)
				.collect(Collectors.toList());

		System.out.println(productPrices);

	}

}
