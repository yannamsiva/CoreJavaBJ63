package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		//w.a.p given number is even or odd from a list

		List<Integer>numbers=Arrays.asList(1,4,6,3,8,9,6);
List<Integer>evenNumber=numbers.stream().filter(s->s%2==0)
.collect(Collectors.toList());

System.out.println(evenNumber);


int [] num= {2,5,7,8,99,4,3};

Arrays.stream(num).filter(s->s%2==0).forEach(System.out::println);

List<String>li=Arrays.asList("A","B","C","C","D","E","F");

li.stream().distinct().forEach(System.out::println);

	}

}
