package com.inher.book;

public class BookClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book bk=new Book();
bk.setBid(1);
bk.setBname("Java");
bk.setBprice(2500);
bk.setBtype("Programming");

System.out.println(bk.getBid()+"\t"+bk.getBname()+"\t"+bk.getBprice()+"\t"+bk.getBtype());

AnnualBook ae=new AnnualBook();
ae.setBid(2);
ae.setBname("Hibernate");
ae.setBprice(250);
ae.setBtype("ORM");
ae.setDiscount(20);
System.out.println(ae.getBid()+"\t"+ae.getBname()+"\t"+ae.getBprice()+"\t"+ae.getBtype()+"\t"+ae.getDiscount());

	
	}

}
