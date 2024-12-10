package com.java8;

import java.util.Arrays;

public class ParrallelArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {1,59,25,64,2,6,35};

	
	System.out.println("Before Sorting");
	for(int  i : ar)
	{
		System.out.println(i);
	}
	System.out.println("After Sorting");
	Arrays.sort(ar);
	
	Arrays.parallelSort(ar,0,4);
	for(int  i : ar)
	{
		System.out.println(i);
	}
	
	
	
	
	
	}

}
