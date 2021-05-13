//Java BufferedInputStream

import java.io.*;  

class ByteStreamDemo8
{  
	public static void main(String args[])
	{  
	try
		{  
	    FileInputStream fin=new FileInputStream("f3.txt");  
	    BufferedInputStream bin=new BufferedInputStream(fin);  
	    
		int i;  
	    while((i=bin.read())!=-1)
		{  
			System.out.print((int)i);  
	    }  
	    
		bin.close();  
	    fin.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
	}  
}  