//Byte Stream : FileInputStream class

import java.io.*;  

class ByteStreamDemo2
{  
	public static void main(String args[]) throws IOException
	{  
		FileInputStream fin=new FileInputStream("abc.txt");  
		int i=0;  
		    
		while((i=fin.read())!=-1) //EOF : end of File
			{  
				System.out.print((char)i);  
		    }  
		fin.close();  
	}  
}  