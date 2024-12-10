package com.encap;

public class TstEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account acc=new Account();
acc.setAcc_no(123456);
acc.setName("savings");
acc.setEmail("yannamsiva@gmail.com");
acc.setAmount(2500);
System.out.println(acc.getAcc_no()+"\t"+acc.getAmount());


	}

}
