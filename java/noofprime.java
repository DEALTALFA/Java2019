import java.util.*;
class noofprime
{
public static void main(String []args)
{
 int n,f=0,flag=0,flag1=0;

for(int i=1;i<1000;i++)
{  
  flag=0;
	for(int j=1;j<=i;j++)
	{		
   if(i%j==0)
	flag++;
	}
if(flag<3)
{System.out.print("\t"+i);
flag1++;
}
}


System.out.println("\nno of prime number present below 1000:"+flag1);
}}