import java.util.Scanner;
class emailexception
{  	public static void main(String []args)
	{
			int flag=0,arr[]={1,1,1,1};
			String str="";
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the email");
		str=s.nextLine();
		try
		{
			if(str.length()<=8)
				throw(new email("Length should be of 8 least"));
			for(int i=0;i<str.length();i++)
			{
				if(Character.isUpperCase(str.charAt(i)))
					arr[0]++;
				else if(Character.isLowerCase(str.charAt(i)))
					arr[1]++;
				else if(Character.isDigit(str.charAt(i)))
					arr[2]++;
				else
					arr[3]++;
			}
			if(arr[0]==1)
				throw(new email("Email should contain atleast have 1 Captial letter "));
			if(arr[1]==1)
				throw(new email("Email should contain atleast have 1 Small letter "));
			if(arr[2]==1)
				throw(new email("Email should contain atleast have 1 Digit"));
			if(arr[3]==1)
				throw(new email("Email should contain atleast have 1 special Character"));
		
		}catch(email e)
		{
			System.out.println(e);
			flag=1;
		}
		if(flag==0)
		System.out.println("Email created \n THANK YOU");
		else
		System.out.println("Email not created RETRY");
					
	}
	
	}
	class email extends Exception
	{	
		String s="";
		email(String a)
		{
			s=s+a;
		}
		public String toString()
		{
		 return s;	
		}
}