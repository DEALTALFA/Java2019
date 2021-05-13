import java.util.Scanner;

class armstrong
{
  public static void main(String []args)
{ 

 int n,sum=0,a,c,flag=0;
//Scanner s=new Scanner(System.in);
  //System.out.println("Enter the number ");
  //n=s.nextInt();
  for(int i=1;i<=1000;i++)
  {  sum=0;
	  a=i;
while(a>0)
{
  c=a%10;
  sum=(int)(sum+(Math.pow(c,3)));
   a/=10;

}
if(sum==i)
	flag++;
  }
System.out.println(flag);

}

}