package com.java8;

interface Addtion
{
	void add(int fno,int sno);
	
}
interface Mul
{
	void mul();
}

interface Div
{
	void div(int f,int s);
}

interface Sub
{
	int sub(int k,int s);
}
public class AddtionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Addtion demo=(fno,sno)->
{
	System.out.println(fno+sno);
};

demo.add(100,200);
int i=10;int j=20;
Mul m=()->
{
	System.out.println(i*j);
};
m.mul();

Div d=(f,s)->
{
	System.out.println(f*s);
};
d.div(20, 2);


Sub demo1=(k,l)->
{
	return k-l;
};
int result=demo1.sub(500,200);
System.out.println(result);


	}

}
