package com.ifcon;

import java.util.Scanner;

public class ifElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Marks");
int marks=sc.nextInt();
String msg="";
if(marks<=100&&marks>=90)
	msg="A + Grade";
else if(marks<90&&marks>=80)
	msg="A  Grade";

else if(marks<80&&marks>=70)
	msg="B Grade";
else if(marks<70&&marks>=60)
	msg="C Grade";
else if(marks<60&&marks>=50)
	msg="D Grade";
else if(marks<50&&marks>=35)
	msg="E Grade";
else
	msg="Try for Sep!";

System.out.println(msg);
	}

}
