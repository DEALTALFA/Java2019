class bnk 
{
	int bal=900;
	
	synchronized void withdraw(int n)
	{	
		if(n>bal)
		{	      
			System.out.println(Thread.currentThread().getName()+" Less Balance : Please go to Deposit Counter");
			try
			{  Thread.sleep(1000); 
				wait();
			}catch(Exception e) {}
		
			System.out.println("Deposit Successfull ");
		}	
		System.out.println("wlcom again at Widthdraw Counter ");
		bal=bal-n;
		System.out.println("WITHDRAW DONE successfully: "+n+"\n balance money:"+bal);		
	  
	}
	
	synchronized void deposit(int n)
	{
		System.out.println("Welcome to Deposit Counter ");
		bal+=n;
		System.out.println("Deposit Successfull ");
		System.out.println("Amount Updated Rs "+bal);
		
		notify();
	}
}

class Thread1 extends Thread 
{
	bnk ob1;
	Thread1(bnk x)
	{
		ob1 = x;
	}
	public void run()
	{
		ob1.withdraw(1000);
	}
}

class Thread2 extends Thread 
{
	bnk ob2;
	Thread2(bnk x)
	{
		ob2 = x;
	}
	public void run()
	{
		ob2.deposit(200);
	}
}

class bank extends Thread
{ 	
	public static void main(String []args)
	{
		bnk obj=new bnk();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();		
	}	
}