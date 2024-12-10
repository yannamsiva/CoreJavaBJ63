package com.abstractex;
abstract class Bank
{
	abstract int getRateOfInterest();
}

class BankOfAmerica extends Bank
{

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}

class Axis extends Bank
{

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}


public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOfAmerica ba=new BankOfAmerica();
		System.out.println("Rate of Interest : "+ba.getRateOfInterest());
	}

}
