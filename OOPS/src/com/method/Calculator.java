package com.method;

public class Calculator {

	void add(int x,int y)
	{
		System.out.println("Addion of Two Numbers : "+(x+y));
	}
	void add(int x,int y,int z)
	{
		System.out.println("Addion of Three Numbers : "+(x+y+z));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		cal.add(10, 20,30);
		

	}

}
