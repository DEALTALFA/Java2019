import java.net.*;
import java.io.*;
class client
{
	public static void main(String[] args) throws Exception
	{
		Socket s=new Socket("localhost",2000);
		OutputStream is=s.getOutputStream();
		DataOutputStream dos=new DataOutputStream(is);
		dos.writeUTF("nice pic dear");
		dos.close();
		s.close();
	}
}