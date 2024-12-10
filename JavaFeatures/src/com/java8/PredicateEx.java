package com.java8;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> lesserThan=i->(i<18);
		
		
		
		
		System.out.println(lesserThan.test(10));
		//filter(Predicate)
		//Predicate
		//Consumer
		//Supplier
		//Function
		
		
		Function<Integer,Double>h=a->1/2.0;
		System.out.println(h.apply(10));
		
		
		Supplier <Double> randomeValue=()->Math.random();
		System.out.println(randomeValue.get());
		
		//w.a.p given number is even or odd from a list
		
		
	}

}
