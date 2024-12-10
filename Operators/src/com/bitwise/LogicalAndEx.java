package com.bitwise;

public class LogicalAndEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int c=2;
		System.out.println(a<b && ++a>c);//false
		System.out.println(a);//10
		System.out.println(a>b && ++a>c);//true
		System.out.println(a);//11
	}

}
