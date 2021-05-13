//Java FileWriter : Character Stream

import java.io.*;  

class CharStreamDemo1
{  
	public static void main(String args[]) throws IOException 
	{  
		FileWriter fw=new FileWriter("abcd.txt");  
		fw.write("my name is sachin");  
		fw.close();
  
		System.out.println("success");  
	}  
}  
