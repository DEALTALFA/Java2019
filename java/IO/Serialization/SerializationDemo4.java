/* Java transient keyword is used in serialization. 
If you define any data member as transient, it will not be serialized. */

import java.io.*;
  
class student implements Serializable
{  
	int id;  
	String name;  
	transient int age;//Now it will not be serialized  
 
	public student(int id, String name,int age) 
	{  
		this.id = id;  
		this.name = name;  
		this.age=age;  
	}  
}  
 
class SerializationDemo4
{  
	public static void main(String args[])throws Exception
	{  
		student s1 =new student(211,"ravi",22);//creating object  
		//writing object into file  
		FileOutputStream f=new FileOutputStream("f3.txt");  
		ObjectOutputStream out=new ObjectOutputStream(f);
		out.writeObject(s1); 
		out.flush();  
	    out.close();  
		f.close();  
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("f3.txt")); 
		student s=(student)in.readObject(); 
		System.out.println(s.age+" "+s.name+" "+s.id);
		
		System.out.println("success");  
	}  
}  