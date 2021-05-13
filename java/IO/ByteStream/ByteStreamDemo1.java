//Java byte Stream : FileOutputStream

import java.io.*;  

class ByteStreamDemo1
{  
	public static void main(String args[]) throws IOException
	{  
		FileOutputStream fout=new FileOutputStream("abc.txt");  
		
		String s="Sachin Tendulkar is my favourite player";  
		byte b[]=s.getBytes();//converting string into byte array  
		
	    fout.write(b);  
	    fout.close();  
	    System.out.println("success...");    
	}  
}  