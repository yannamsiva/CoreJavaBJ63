package com.method;

class A
{
	void funX()
	{
		System.out.println("A class FunX");
	}
	
	void funC()
	{
		System.out.println("A class funC");
	}
}


class B extends A
{
	//overriding
	void funX()
	{
		super.funX();
		System.out.println("B class FunX");
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new B();
b.funX();
b.funC();

A c=new A();
c.funX();
	}

}
