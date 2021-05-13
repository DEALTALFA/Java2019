import java.util.*;
class magicnumber
{                                                                                                                                        
 public static void main(String[]args)
 { 
int sum=0,num; 
 Scanner s=new Scanner(System.in);
   System.out.println("Enter a number");
   int n=s.nextInt();

    while(n>9)
	{   num=n;
        sum=0;
while(num!=0)
{
		sum=sum+((num%10)*(num%10));
		num/=10;
	}
	n=sum;
	}
if(sum==1)
System.out.println("Magic number");
else	
System.out.println("Not a Magic number");	 
 }
}