import java.util.Scanner;
class uppertolower
{
 public static void main(String []args)
 {
    Scanner s=new Scanner(System.in);
	//System.out.println("Enter the string of ur choice");
	String str3="",str="hello how are you";
	//char str2[]=str.toCharArray();
	int l=str.length();
	System.out.println("length of String="+l);
	for(int i=0;i<l;i++)
	{	str3="";
		while(i<l&&str.charAt(i)!=' ')
			{	
					str3+=str.charAt(i);
					i++;
                   
			}
			if(str3.length()>0)
				System.out.println(str3+"->"+str3.length());
	}	
	
 }
}