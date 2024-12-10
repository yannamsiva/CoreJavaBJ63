package com.shiva;

 class D
{
	
}
public class A {

	protected int i=100;
	protected void funX()
	{
		System.out.println("funX");
	}
	
	protected A()
	{
		System.out.println("A constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A b=new A();
System.out.println(b.i);
b.funX();
	}

}
