import java.util.Scanner;
class printarray
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int i,j,arr[][]={{1,2,3},{4,5,6},{7,8,9}};
				for(i=0;i<=2;i++)
		{   for(j=0;j<=2;j++)
			{
				System.out.print(arr[i][j]);
			}
		System.out.println("");
		}
		System.out.println("");
         for(i=0;i<=2;i++)
		{   for(j=0;j<=2;j++)
			{
				System.out.print(arr[j][i]);
			}
		System.out.println("");
			
		}
		System.out.println("");
		for(i=0;i<=2;i++)
		{
			for(j=2;j>=0;j--)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println("");
			
		}
			System.out.println("");	
    for(i=2;i>=0;i--)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println("");
			
		}
		System.out.println("");
		for(i=2;i>=0;i--)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		
			System.out.println("");
		for(i=2;i>=0;i--)
		{
			for(j=2;j>=0;j--)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println("");
			
		}
		
		
	
}
}