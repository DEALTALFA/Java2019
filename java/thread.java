class ABC
{
	synchronized void show1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : value "+i);
			try
			{
				if(i==5)
					wait();                   //wait used to run the other thread except this
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
	synchronized void show2()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : value "+i);
			try
			{
				Thread.sleep(1000);
				notify();                       //notify the waiting thread that he has done this job u can now continue
			}catch(Exception e) {}
		}
	}
}
class Thread1 extends Thread
{
	ABC ob1;
	Thread1(ABC x)
	{
		ob1=x;
	}
	public void run()
	{
		ob1.show1();
	}
}

class Thread2 extends Thread
{
	ABC ob2;
	Thread2(ABC x)
	{
		ob2=x;
	}
	public void run()
	{
		ob2.show2();
	}
}

class thread extends Thread
{
	
	public static void main(String []args)
	{  
	ABC obj=new ABC();
	Thread1 t1=new Thread1(obj);
	Thread2 t2=new Thread2(obj);
	t1.start();
	t2.start();
	}
}


