import java.io.*;
class _500char
{
	public static void main(String []args)throws Exception  
	{
		File f=new File("a.txt");
		f.createNewFile();
		int i;
			FileReader fr=new FileReader(f);
			FileWriter fw=new FileWriter(f,true);
			if(f.length()>=500)
			{
				fw.write("deepak");
			}
			else
			{
				String str="";
					int l;
					while((l=fr.read())!=-1)
					{
						char s=(char)l;
						str+=String.valueOf(s);
					}
					System.out.println(str);
					int p=500-str.length();
					int j=0;
				for(i=0;i<p;i++)
				{
					int k=((j++)%(str.length()));
					char ch=str.charAt(k);
					fw.write(ch);
				}
			
			}
			
				fw.close();
				fr.close();
	}
}