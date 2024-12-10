package com.java5;

public class VaragEx {

	static void display(String[] st, String... args) {
		System.out.println("Course Names :");
		for (String name : st) {
			System.out.println(name);
		}

		System.out.println("Faculty Names :");
		for (String name : args) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Varrags allowes the Method to accept zero or multiple arguments

		String courses[] = { "Java", "Angular", "ReactJs" };
		display(courses);

		display(courses, "shiva");
		display(courses, "shiva", "rani");
		display(courses, "shiva", "rani", "lilly");
	}

}
