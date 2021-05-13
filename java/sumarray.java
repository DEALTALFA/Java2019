import java.util.Scanner;
class sumarray
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int rsum=0,csum=0,i,j,arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(i=0;i<=2;i++)
		{   for(j=0;j<=2;j++)
			{
				System.out.print(arr[i][j]);
			}
		System.out.println("");
		}
		System.out.println("");
        for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
		
				if(i==0&&j==1)
					System.out.print(arr[i][j]);
				else if(i==1)  
					System.out.print(arr[i][j]);
				else if(i==2&&j==1)
					System.out.print(arr[i][j]);
			}
			
		
					System.out.println("");
		}
		for(i=0;i<=2;i++)
		{	rsum=0;
			for(j=0;j<=2;j++)
			{
				rsum+=arr[i][j];
			}
			
			System.out.println("sum of "+(i+1)+"row is"+rsum);
					
		}	
		for(i=0;i<=2;i++)
		{	csum=0;
			for(j=0;j<=2;j++)
			{
				csum+=arr[j][i];
			}
			
			System.out.println("sum of "+(i+1)+"column is"+csum);
					
		}		
		
		
	
}
}