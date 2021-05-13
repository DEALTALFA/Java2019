//Byte Stream : FileInputStream class

import java.io.*;  

class ByteStreamDemo3
{  
	public static void main(String args[])throws Exception
	{  
		FileInputStream fin=new FileInputStream("ByteStreamDemo3.java");  
		FileOutputStream fout=new FileOutputStream("M.java");  

		int i=0;  
		while((i=fin.read())!=-1) //EOF : end of File
		{  
			fout.write((byte)i);  
		}  
	fin.close();  
	}  
}  