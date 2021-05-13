import java.lang.Math;
class thread extends Thread
{
	
	public static void main(String []args)
	{ 
		A ob=new A();
		ob.start(); 
	}
}
class A extends Thread
{
	public void run()
	{
		for(int i=0;;i++)
		{  
			for(int j=0;j<60;j++)
			{
				for(int k=0;k<60;k++)
				{
					System.out.println(i+"hrs:"+j+"min:"+k+"sec");
					 try
					{
						 Thread.sleep(1000);
					 }catch(Exception E)
					 {
						
					 }
				}
			}
			
		}
		
	}
	
}

