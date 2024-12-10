package com.ifcon;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("He/She is Major");
		} else
			System.out.println("He/She is Minor");
	}

}
//w.a.p given number even or odd
