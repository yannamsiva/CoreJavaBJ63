package com.unary;

public class PostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int y=x++;//post increment
System.out.println(y);//10
System.out.println(x);//11
System.out.println(x++);//11 
	
System.out.println(x);//12

int a=10;
int b=a++;
System.out.println(b);//10
System.out.println(a);//11
System.out.println(++a);//12
System.out.println(--a);	//11
	}

}
