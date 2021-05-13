class Abc extends Thread
{
	public void run()
	{	for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+(i+1));
		try
		{
			Thread.sleep(1000);
		}catch(Exception ae){}
		}
	}
	public static void main(String []args)
	{
		Abc obj=new Abc();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.start();
		t2.start();
			try{ t1.join(5000); } catch(Exception e){}  //join used to determine the time to be synchronized no disturabance like Synchronized function
	    t2.suspend();
		 t2.resume();
		 t2.stop();
		 wait()// pause the current thread
		 notify() //resume the waited thread used with wait()
	}
}


