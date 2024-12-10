package com.stream.assignments;

import java.util.Arrays;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = Arrays.asList(1,3,6,8,10,18,36);
		
		System.out.println("List of Numbers : "+nums);
		
		
		//Calucalte the average using Streams
		
		double  average = nums.stream().mapToInt(Integer::intValue).average().orElse(0);
		
		System.out.println("Average value of the said numbers :"+average);
		
	}

}
