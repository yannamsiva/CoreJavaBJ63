
public class TestSleep extends Thread {

	public void run()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<5;++i)
		{
			//the thread will sleepp for the 500 milli seconds
			
			
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSleep t1=new TestSleep();
		
	t1.start();
	for(int i=10;i<15;++i)
	{
	
		System.out.println(i);
	}
	}

}
