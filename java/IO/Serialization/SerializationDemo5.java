//Java Deserialization : Deserialization is the process of reconstructing the object from the serialized state.It is the reverse operation of serialization.

import java.io.*;  
class SerializationDemo5
{  
	public static void main(String args[])throws Exception
	{  
    
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("f3.txt"));  
		student s=(student)in.readObject();  
		System.out.println(s.id+" "+s.name+" "+s.age);  
  
		in.close();  
	}  
}  