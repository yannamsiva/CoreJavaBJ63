package com.unary;

public class PreIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=++x;//pre increment
		
		
System.out.println(y);//11
System.out.println(x);//11
System.out.println(++y);//12
System.out.println(x);//11

System.out.println(y);//12
	char ch='z';
	System.out.println((int)ch);//
	//except boolean data type remaining data types can perform increment,decrement
	int c=(int)ch--;
	System.out.println(c);
	System.out.println(ch);
	
	}

}
