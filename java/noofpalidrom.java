
class noofpalidrom
{
public static void main(String []args)
{ 
 int sum=0,c,a,sl=0,flag=0;
for(int i=1;i<1000;i++)
{  sum=0;
  sl=i;
  while(sl>0)
  {  a=sl%10;
	 sum=sum*10+a;
	 sl/=10;
}
	  
if(sum==i)
{
	System.out.print("\t"+sum);
 flag++;	
}

}System.out.println("\nthe number of palidrome are :"+flag);
}
}