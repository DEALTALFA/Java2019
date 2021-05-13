import java.io.*;
import java.util.*;
class filecreate
{
	public static void main(String []args) throws Exception
	{ 
		FileWriter fw=new FileWriter("file.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("tuje kitnas");
		bw.close();
		fw.close();
		FileReader fr=new FileReader("file.txt");
		BufferedReader br=new  BufferedReader(fr);
		String s; 
		while((s=br.readLine())!=null)
			System.out.println(s);
		br.close();
		fr.close();
	}
}