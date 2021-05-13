import java.util.Scanner;
class abbrivation
{
 public static void main(String []args)
 {
    Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the string of ur choice");
	String str3="";
	int flag=0,flag2=0,flag3=0;
	String str=s.nextLine();
	//char str2[]=str.toCharArray();
	int l=str.length();
	System.out.println("length of String="+l);
	for(int i=0;i<l;i++)
	{	str3="";
		while(i<l && str.charAt(i)!=' ')
			{	     
					str3+=str.charAt(i);
					i++;				 
			}
			flag=str.lastIndexOf(" ");
            flag3++;
			for(int j=0;j<str3.length();j++)
			{  
				flag2++;
		        if(j==0)
			 	{    
			        if(flag2<flag)
						System.out.println(str3.charAt(j));
				}
				else if((flag2+flag3)>=flag)
				{
					System.out.println(str3);
					break;
				}
			 }
	}	
	
 }
}