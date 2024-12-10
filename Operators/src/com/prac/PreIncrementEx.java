package com.prac;

public class PreIncrementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int y=x++;//post increment
System.out.println(y);//10
System.out.println(x);//11

int z=++y;//pre increment
System.out.println(z);//11
System.out.println(y);//11
	}

}
