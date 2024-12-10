package com.ifcon;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		if(age>18)
		{
			System.out.println("Enter The Weight");
			int weight=sc.nextInt();
			if(weight>40)
				System.out.println("He/She Can give the Blood");
			else
				System.out.println("He/She is Under Weight");
			
		}
		else
			System.out.println("He/She Is Minor");
	
	}

}
