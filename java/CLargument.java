import java.util.*;
import java.io.*;
class CLargument
{
public static void main(String []args)
{
	char ch;
	int sum=0,flag1=0,flag2=0,flag3=0,flag4=0,flag5=0;
	String str,str2="";
	for(int i=0;i<args.length;i++)
	{	str=args[i];
   // System.out.println(str);
    for(int j=0;j<str.length();j++)
		if(Character.isDigit(str.charAt(j)))  
			//charAt(j)=picks char from str and check the index of j is digit or not
		{	ch=str.charAt(j);      //storing in char  type  
	        String t=Character.toString(ch);//coverting to string bcz parseInt(String) is required
			sum=sum+Integer.parseInt(t);
		}
		else
		{
			str2=str2+str.charAt(j);
		}
}
for(int i=0;i<str2.length();i++)       
{
	if(str2.charAt(i)=='d'||str2.charAt(i)=='D')
			flag1++;
		else if(str2.charAt(i)=='E'||str2.charAt(i)=='e')
			flag2++;
		else if(str2.charAt(i)=='P'||str2.charAt(i)=='p')
			flag3++;
		else if(str2.charAt(i)=='A'||str2.charAt(i)=='a')
              flag4++;
		else if(str2.charAt(i)=='K'||str2.charAt(i)=='k')
			  flag5++;
}System.out.println("\nD\t"+flag1+"\nE\t"+flag2+"\nP\t"+flag3+"\nA\t"+flag4+"\nK\t"+flag5);
		 System.out.println("Sum of digit is :\t"+sum);
	if(flag1>0&&flag2>=2&&flag3>0&&flag4>0&&flag5>0)
		System.out.println("Deepak can be formed for the argumnets provided");	
    else
		System.out.println("Deepak cannot be formed for the argumnets provided");
}

}