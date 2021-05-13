import java.io.*;  

class Person implements Serializable
{  
	int id;  
	String name;  
	Person(int id, String name) 
	{  
		this.id = id;  
		this.name = name;  
	}  
}  

class student extends Person
{  
	String course;  
	int fee;  
	public student(int id, String name, String course, int fee) 
	{  
		super(id,name); 
		this.course=course;  
		this.fee=fee;  
	}  
}  
public class SerializationDemo3
{  
	public static void main(String args[])throws Exception
	{  
	student s1 = new student(1002,"Ashish Sethi","MCA",75000);  
  
	FileOutputStream fout=new FileOutputStream("f1.txt");  
	ObjectOutputStream out=new ObjectOutputStream(fout);  
  
	out.writeObject(s1);  
	out.flush();  
	
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("f1.txt"));  
	student s=(student)in.readObject();  
	System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee); 
	in.close();
	
	System.out.println("success");  
	}  
}  