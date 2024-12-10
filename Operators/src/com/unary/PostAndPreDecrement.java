package com.unary;

public class PostAndPreDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int y=x--;//post decrement
System.out.println(y);//10
System.out.println(x);//9

System.out.println(y--);// 10
System.out.println(y);//9
System.out.println(x);//9

int a=10;
int b=--a;//pre decrement
System.out.println(a);//9 
System.out.println(b);//9
System.out.println(a--);//9
System.out.println(a);//8
System.out.println(--a);// 7


	}

}
