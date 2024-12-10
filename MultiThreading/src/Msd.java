class A
{
}
class Msd extends A implements Runnable
{
	public void run()
	{
for (int i=0;i<10 ;i++ ){
	System.out.println("inside run method:"+i);
try
{
Thread.sleep(5000);	
}
catch (Exception e)
{
	System.out.println(e);
}

}//forloop	
		
		

	}//run mehtod
	public static void main(String[] args) //by default time slice  5
	{
		Msd m=new Msd();
//		m.run();
Thread t=new Thread(m);
		t.start();
try
{
t.join();
}
catch (Exception e)
{
}
		for (int i=10;i<20 ;i++ )
	System.out.println("inside main method:"+i);


	}
}