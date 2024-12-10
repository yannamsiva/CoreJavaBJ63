package com.java5;

class Addtion
{
	//covarient
	Addtion add(int fno,int sno)
	{
		System.out.println("Addtion class Two Numbers"+(fno+sno));
		return new Addtion();
	}
}


public class Calculation extends Addtion {
	Calculation add(int fno,int sno)
	{
		System.out.println("Calculation class Two Numbers"+(fno+sno));
		return new Calculation();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculation c=new Calculation();
c.add(100,200);
	}

}
