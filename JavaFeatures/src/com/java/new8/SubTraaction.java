package com.java.new8;

@FunctionalInterface
interface Subtract {
	void sub();
}

@FunctionalInterface
interface Multiplication {
	void mul(int x, int y);
}

@FunctionalInterface
interface Division {
	int div(int x, int y);
}

public class SubTraaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subtract s = () -> {
			System.out.println("subtracting of two numbers");
		};

		s.sub();

		Multiplication m = (a, b) -> {
			System.out.println("mulitplication of Two numbers" + (a * b));
		};

		m.mul(10, 10);

		Division d = (x, y) -> {
			int result = x / y;
			return result;
		};

		int res = d.div(100, 5);
		System.out.println("division of Two numbers : " + res);

	}

}
