package com.inher.book;

class Animal
{
	void eat()
	{
		System.out.println("Eating....");
	}
	
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking....");
	}
}

class BabyDog extends Dog
{
	void weeping()
	{
		System.out.println("Weeping....");
	}
}

public class TestInhertiance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d=new BabyDog();
d.eat();
d.bark();
	}

}
