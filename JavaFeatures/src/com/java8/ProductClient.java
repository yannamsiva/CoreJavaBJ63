package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Product>list=new ArrayList<Product>();
list.add(new Product(1,"tv",10,250));
list.add(new Product(2,"Ac",10,250));
list.add(new Product(3,"Cooler",10,250));
list.add(new Product(4,"Fan",10,250));
list.add(new Product(5,"Bottole",10,250));

list.forEach(
		(p)->
		{
			System.out.println(p.getId()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.getQty());
		}
		
		
		
		);






System.out.println("------------------Desending--------------------------------");
Collections.sort(list,
		(p1,p2)->
{
	return p1.getPname().compareTo(p2.getPname());
});




System.out.println("--------------------------------------------------");

list.forEach(
		(p)->
		{
			System.out.println(p.getId()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.getQty());
		}
		
		
		
		);
		
		
		
		
		




	}

}
