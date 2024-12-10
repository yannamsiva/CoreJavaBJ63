package com.java8;
@FunctionalInterface
interface Z
{
	void funX();
}
public class LamdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sno=100;
Z z=()->{
	System.out.println("Implementation code "+sno);
};

z.funX();
	}

}
