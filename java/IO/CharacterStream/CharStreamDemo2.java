//Java FileReader : Character Stream
import java.io.*;  
class CharStreamDemo2
{  
	public static void main(String args[])throws IOException
	{  
		FileReader fr=new FileReader("abcd.txt");  
	  
		int i;  
		while((i=fr.read())!=-1)  
		{
			System.out.print((char)i); 
		} 
	
		fr.close();  
	}  
}  	