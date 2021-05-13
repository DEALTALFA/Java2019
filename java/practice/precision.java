import java.text.DecimalFormat;
class precision
{
	public static void main(String []args)
	{ double sump=0,sum=0,sumn=0;
		int arr[]={1,1,0,-1,-1};
		for(int a:arr)
			if(a<0)
				sumn+=a;
			else if(a>0)
				sump+=a;
			else
				sum=0;
			/* 
			DecimalFormat df=new DecimalFormat(); int s=123.12343534647
			df.setMaximumFractionDigits(6);
			System.out.println(df.format(s)); <-123.123425*/
			System.out.printf("%.6f",sump/5.0);
			System.out.printf("\n%.6f",sumn/5.0);
			
	}
}