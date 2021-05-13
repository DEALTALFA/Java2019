
class trythrow
{
	public static void main(String []args)
	{
      int age=0;
	  age=19;
	  try
	  {
		  if(age<18)
		  {  
			  throw(new ageException(age));  //calling user define exception
		  }
		  else
			  System.out.println("Welcome");
	  }
	  catch(ageException e)
	  {
		  System.out.println(e);
	  }
	}
}
class ageException  extends Exception//user define exception
{ 	
	String s="";
	ageException(int a)
	{  
	s=s+a;
	}
	public String toString()
	{
		return s;
	}
}
