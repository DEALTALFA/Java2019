import java.util.Scanner;
class arrayfirst
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int arr[]=new int[6],sum=0,sum2=0,sum3=0;
		System.out.println("Enter array:");
		
     for(int i=0;i<arr.length;i++)
	 {
		 arr[i]=s.nextInt();
		 
	 }		 
	for(int i=0;i<arr.length;i++)	
	{ if(i%2!=0)
		if(arr[i]%2==0)
		{
		sum+=arr[i];
		}
		else if(i%2==0)
		{	if(arr[i]%2!=0)
				sum2+=arr[i];
		}
       else
  sum3+=arr[i];		   
				
	}System.out.println("Sum at \nodd index with even number:"+sum+"\neven index with odd number:\t"+sum2+"\nremaining array sum is\t"+sum3);
	}
	
}