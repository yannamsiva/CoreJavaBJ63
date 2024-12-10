package com.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]str=new String[10];
str[5]="shiva";

	Optional<String> checkNull = Optional.ofNullable(str[5]);
	if(checkNull.isPresent())
	{
		String tolowerCase=str[5].toLowerCase();
		System.out.println(tolowerCase);

	}
	else
		System.out.println("String value is not present");
	
	}

}
