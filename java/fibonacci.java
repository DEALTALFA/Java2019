import java.util.Scanner;
class fibonacci
{
public static void main(String []args)
{Scanner s=new Scanner(System.in);  
int n,f=0,t=1,sum=0;
System.out.println("upto whivh u want see");
n=s.nextInt();
for(int i=0;i<n;i++)
{
   f=t;
t=sum;
sum=f+t;
 System.out.println("           "+t);
}
}

}