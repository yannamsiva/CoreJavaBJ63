package com.patterns;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int count = 0;
		int i = 0;
		if (num == i || num == 1) {
			System.out.println("Not A Prime Number : " + num);
		} else {
			for (i = 2; i <= num; ++i) {
				if (num % i == 0) {
					count++;
				}
			}
		}

		if (count == 1) {
			System.out.println("Given Number is prime Number");
		} else {
			System.out.println("Given Number is Not A Prime Number");
		}

	}

}
