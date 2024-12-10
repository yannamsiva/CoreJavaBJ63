package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForEAchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>faculties=new ArrayList<String>();

faculties.add("shiva");
faculties.add("rani");
faculties.add("manisha");
faculties.add("lilly");

for(String s : faculties)
{
	System.out.println(s);
}
System.out.println("-----------------------------------------");
faculties.forEach((e)->System.out.println(e));
		
		



	}

}
