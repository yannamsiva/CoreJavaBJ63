package com.abstractex;

public class AddtionClient extends Addtion {

	@Override
	int add(int fno, int sno) {
		// TODO Auto-generated method stub
		return fno+sno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddtionClient ad=new AddtionClient();
		int result=ad.add(100, 200);
		System.out.println("Addition of Two Numbers : "+result);
		
		
	}

}
