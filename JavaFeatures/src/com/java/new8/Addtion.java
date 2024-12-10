package com.java.new8;

interface X
{
	default void doIt()
	{
		System.out.println("Super shiva");
	}
}

@FunctionalInterface
interface Add extends X
{
	void add(int fno,int sno);
}

public class Addtion  implements Add  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addtion a=new Addtion();
		a.add(10,20);
		a.doIt();
	}

	@Override
	public void add(int fno,int sno) {
		// TODO Auto-generated method stub
		System.out.println("Addtion of two numbers");
	}

}
