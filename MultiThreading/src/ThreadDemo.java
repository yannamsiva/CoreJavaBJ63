class MyThread extends Thread
{
	
	public void run()
	{
		try {
			Thread.sleep(5000);
			System.out.println("The current thread name is : "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;++i)
		{
			System.out.println("Child thread"+i);
		}
	
		
			
	}
	
	
}


public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating three threads
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
			
		//Thread1 started
		t1.start();
		
		//starting the second thread after when the first thread t1 has ended or died
		
		try {

			System.out.println("The Current Thread name is : "+Thread.currentThread().getName());
			
			//invoking the join() method

			t1.join();

		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//thread2 started
		t2.start();
		//starting the Third thread after when the first thread t1 has ended or died
		
		
		try {

			System.out.println("The Current Thread name is : "+Thread.currentThread().getName());
			
			//invoking the join() method

			t2.join();

		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//third thread start
		t3.start();
		
		
		
		
		//t.start();
		
		for(int i=0;i<10;++i)
		{
			System.out.println("Main Thread");
		}
		
		
		
		
	}

}
