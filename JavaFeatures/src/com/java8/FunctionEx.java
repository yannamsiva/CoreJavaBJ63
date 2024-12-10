package com.java8;

@FunctionalInterface
interface X
{
	void funX();
}

public class FunctionEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Interface and Abstract class object we can create using Annomous class
		
		X x=new X()
				{
		public 	void funX()
			{
				System.out.println("funX ");
			}
				};
				
				
				x.funX();
	
	
	}

	

}





/*
 * public class FunctionEx implements X{
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * FunctionEx f=new FunctionEx(); f.funX(); }
 * 
 * @Override public void funX() { // TODO Auto-generated method stub
 * System.out.println("FunctionEx hoiiiii"); }
 * 
 * }
 */