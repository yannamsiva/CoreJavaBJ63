package com.mul;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;++i)
		{
			System.out.println("Run Method : "+i);
		}

	}
	
	
	public static void main(String[]args)
	{
		
		MyThread m=new MyThread();
		
		Thread t=new Thread(m);
		t.start();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=10;i<15;++i)
		{
			System.out.println("main Method : "+i);
		}
		
	}

}
