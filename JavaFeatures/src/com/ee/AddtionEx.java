package com.ee;

@FunctionalInterface
interface Addtion {
	void add();

}

//method with parameters
interface Subtraction {
	void sub(int fno, int sno);
}
//method with return types

interface Multiplicaition {
	int mul(int fno, int sno);
}

public class AddtionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using Lambda implementing functional interface
		Addtion ad = () -> {

			System.out.println("Addtion of Two numbers");

		};
		ad.add();
		Subtraction su = (fno, sno) -> {

			System.out.println("Subtraction of Two Numbers : " + (fno - sno));
		};

		su.sub(500, 200);

		Multiplicaition m = (fno, sno) -> {
			return fno * sno;
		};

		int result = m.mul(10, 5);
		System.out.println("Multiplication of Two Numbers : " + result);

	}

}
