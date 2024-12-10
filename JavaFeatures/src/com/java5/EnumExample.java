package com.java5;

public class EnumExample {

	//defining the enum inside the class
	 enum Directions
	{
		NORTH(5),SOUTH(6),WEST(3),EAST(9);
		private int value;
		 private Directions(int value)
		 {
			 this.value=value;
		 }
		};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(Directions d : Directions.values())
{
	System.out.println(d);
}
	}

}
