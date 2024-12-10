package com.stream.assignments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * List<String> colors = Arrays.asList("RED","GREEN","WHITE","ORANG","PINK");
		 * 
		 * 
		 * //covert strings to uppercase using streams
		 * 
		 * List<String> upperCaseStrings =
		 * colors.stream().map(String::toUpperCase).collect(Collectors.toList());
		 * 
		 * upperCaseStrings.forEach(System.out::println);
		 * 
		 * 
		 * upperCaseStrings.stream().forEach(s->System.out.println(s));
		 */
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,1,2,3,4,7,8,9);
		
		//Sum of even Numbers
	//	int sumOfEvens=numbers.stream().filter(num->num%2==0).mapToInt(Integer::intValue).sum();
		
		
	/*
	 * Stream<Integer> filterEven = numbers.stream().filter(num->num%2==0);
	 * IntStream mapToInt = filterEven.mapToInt(Integer::intValue); //int sum =
	 * mapToInt.sum(); long count = mapToInt.count(); System.out.println(count);
	 */
	//	System.out.println(sumOfEvens);
	
		
		//remove duplicates
		/*
		 * Stream<Integer> distinct = numbers.stream().distinct();
		 * 
		 * List<Integer> distinctNumbers = distinct.collect(Collectors.toList());
		 * 
		 * distinctNumbers.forEach(System.out::println);
		 */

		
		//start with specific letter
		
		/*
		 * List<String> colors = Arrays.asList("RED","GREEN","WHITE","GRANK","PINK");
		 * char startingLetter='K';
		 * 
		 * 
		 * long count =
		 * colors.stream().filter(s->s.endsWith(String.valueOf(startingLetter))).count()
		 * ;
		 * 
		 * System.out.println(count);
		 */		
		
		
		//sort the given elements in acending order and descending order
		
		
		List<String> colors = Arrays.asList("RED","GREEN","WHITE","GRANK","PINK");

		
		//colors.stream().sorted().forEach(System.out::println);
		
		colors.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		
		
		
		

	}

}
