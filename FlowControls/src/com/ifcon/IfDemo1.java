package com.ifcon;

import java.util.Scanner;

public class IfDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Given Number is Even  : "+num);
			
		}
		else
			System.out.println("Given Number is Odd  : "+num);
		
	}

}
