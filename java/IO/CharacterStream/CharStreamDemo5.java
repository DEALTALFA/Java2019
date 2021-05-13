import java.io.*;  
class CharStreamDemo5
{  
	public static void main(String args[])throws IOException
	{  
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);  
  
	String name="Ashish";  
  
	while(name.equals("stop"))
		{  
		   System.out.println("Enter data: ");  
		   name=br.readLine();  
		   System.out.println("data is: "+name);  
		}  
	br.close();  
	r.close();  
	}  
}  