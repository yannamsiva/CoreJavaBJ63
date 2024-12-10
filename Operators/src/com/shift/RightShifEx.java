package com.shift;

public class RightShifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  >> is used to move the the value of the left operand to right by the number of bits specified by the right operand
		
		System.out.println(20>>2);//20/2^2=20/4(2*2)=5
		System.out.println(10>>5);//10/2^5=10/32(2*2*2*2*2)=0
		System.out.println(10>>3);//10/2^3=10/8=1
		
		System.out.println(10>>9);
		
		System.out.println(10>>2);
		System.out.println((int)10.5>>2);
		double d=10.5;
		int i=2;
		System.out.println((int)d>>i);
		
		System.out.println((int)d/i);
		
		
	}

}
