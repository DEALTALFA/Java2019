class threadrunnable implements Runnable
{
	public void run()
	{
		System.out.println("run called");
	}
	public static void main(String []args)
	{
		threadrunnable tr=new threadrunnable();
		Thread t=new Thread(tr);
		t.start();
	}
}