package com.patterns;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int i=0;//intialization while(i<5)//condtion { System.out.println(i);
		 * ++i;//increment }
		 */

		boolean flag=true;
		int i=3;
	while(flag)
	{
		System.out.println("Good morning");
		if(i%2==0)
		{
			System.out.println("Given Number is Number");
			flag=false;
		}
		else
		{
			
			System.out.println("Given Number is Not A Number");
		flag=false;
		}
	}
		
	
	
	}

}
