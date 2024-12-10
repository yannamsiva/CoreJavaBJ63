package com.bitwise;

public class LogicalEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int c=2;
		System.out.println(a<b || ++a>c);//true
		System.out.println(a);//11
		System.out.println(a>b || ++a>c);//true
		System.out.println(a);//11
	}

}
