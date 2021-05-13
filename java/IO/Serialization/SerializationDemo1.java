/* In this example, we are going to serialize the object of Student class. The writeObject() method of ObjectOutputStream class provides the functionality to serialize the object. We are saving the state of the object in the file named f.txt. */

import java.io.*;  

class student implements Serializable
{  
	int id;  
	String name;  
	
	public student(int id, String name) 
	{  
		this.id = id;  
		this.name = name; 
	}  
}  
 
public class SerializationDemo1
{  
	public static void main(String args[])throws Exception
	{  
		student s1 =new student(1002,"Ashish Sethi");  
	  
		FileOutputStream fout=new FileOutputStream("f.txt");  
		ObjectOutputStream out=new ObjectOutputStream(fout); 
		out.writeObject(s1);
		out.flush();  
		System.out.println("success"); 
				fout.close();
				out.close();
	}  
}  