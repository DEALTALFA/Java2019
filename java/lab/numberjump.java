import java.util.Scanner;
import java.lang.Math.*;
class numberjump
{
	public static void main(String []args)
	{ System.out.println("no one literally no one.....Enter IT!!");    
	Scanner s=new Scanner(System.in);
	//5496
		int i=s.nextInt();
		int a,num,num2,j,flag=0;
		while(i>9)
		{   
			flag=0;
			num=i;
			//count no. of digit present
			while(num!=0)
			{
				num=num/10;
				flag++;
			}
			System.out.println("new array");
			System.out.println("flag="+flag);
			num2=i;
			int arr[]=new int[flag];
			int arr2[]=new int[flag];
			j=flag-1;
			//converting to int array
			while(num2!=0)
				{
					arr[j]=num2%10;
					num2/=10;
					j--;
					
				}
			
			for( j=0;j<flag;j++)
			    System.out.println("arr["+j+"]\t"+arr[j]);
			//condition
			if(arr[0]<=arr[flag-1])
			{for(j=0;j<flag-1;j++)
				{
					arr[j]=arr[j]-arr[j+1];
					if(arr[j]<0)
					{
						arr[j]=arr[j]*(-1);
					}
					
			}
				System.out.println("After subtraction:\t");
				for(j=0;j<flag-1;j++)
				System.out.println("arr["+j+"]\t"+arr[j]);
				}
			else
				{  int p=0;
					for(j=flag-1;j>=1;j--)
				{
					arr2[p]=arr[j]-arr[j-1];
				
					if(arr2[p]<0)
					{
						arr2[p]=arr2[p]*(-1);
					}
										p++;
				}
				System.out.println("After subtraction:\t");
				for(j=0;j<flag-1;j++)
				System.out.println("arr2["+j+"]\t"+arr2[j]);
				
				for(j=0;j<flag-1;j++)
					arr[j]=arr2[j];
				System.out.println("swapped:");
				for(j=0;j<flag-1;j++)
					System.out.println(""+arr[j]);
				}
				int flag2=0;
				flag2=flag-2;
				i=0;	
				for(j=0;j<flag-1;j++)
				{   
					i=i+((int)Math.pow(10,flag2)*arr[j]);
					flag2--;
				}
				System.out.println("final array:"+i);
			
		}//while
	}
	
}