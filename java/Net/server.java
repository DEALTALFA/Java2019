import java.net.*;
import java.io.*;
class server
{
	public static void main(String[] args) throws Exception
	{	ServerSocket ss=new ServerSocket(2000);
		System.out.println("Server Started");
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		System.out.println(dis.readUTF());
		ss.close();
	}
}