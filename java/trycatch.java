import java.util.*;

class trycatch
{
	public static void main(String []args)
	{
		int a=0,b=0,c=0;
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter a Value ");
			a=sc.nextInt();
			System.out.println("Enter a Value ");
			b=sc.nextInt();
			c=a/b;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Do not Input Alphabet/Special Character ");
		}
		catch(ArithmeticException e)
		{
			System.out.println(" Do enter 0 as Input");
		}
		finally
		{
		System.out.println(c);
		}
		System.out.println(c+1);
		
	}
}