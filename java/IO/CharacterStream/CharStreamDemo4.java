import java.io.*;  

class CharStreamDemo4
{  
	public static void main(String args[])throws Exception
	{  
		String name;
		
		InputStreamReader r=new InputStreamReader(System.in); //System.in is 8bit to convert 16 bit reader 
		BufferedReader br=new BufferedReader(r);  
  
		System.out.println("Enter your name");  
		name=br.readLine();  
		System.out.println("Welcome "+name);  
	}  
}  