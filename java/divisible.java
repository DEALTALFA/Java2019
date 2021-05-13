import java.util.*;
import java.io.*;
class oddnumber
{
public static void main(String []args)
{
 int n,sum=0;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the number");
 n=s.nextInt();
 int i=0,f=1,sec=0;
 int s1=1;
 do
 {	
    //f=((int)Math.pow(10,i))+sec;
	f=s1+sec;
	s1*=10;
    System.out.print("\t"+f);
	sec=f;
	 
 i++;
 }while(i<=n);
}

}