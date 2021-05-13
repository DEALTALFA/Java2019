class all
{ 
	static void armstrong()
	{
		int i,c,k,sum,flag1=0;
	for(i=1;i<=1000;i++)
	{ //armstrong
          
       k=i;   
       sum=0;
	   while(k>0)
		{
			c=k%10;
			sum=(int)(sum+(Math.pow(c,3)));
			k/=10;
		}
		if(i==sum)
			flag1++;
	}
	System.out.println("armstrong:"+flag1);
	}
	
		static void palidrome()
		{//palidrome
int flag2=0;	
	for(int i=1;i<=1000;i++)
		{
			int a,sum=0;
		int sl=i;	
		while(sl>0)
		{
			a=sl%10;
			sum=sum*10+a;
			sl=sl/10;                
		}
		if(sum==i)
			flag2++;
		}
		System.out.println("palidrome:"+flag2);
		}
      static void prime()
			{
		//prime
		int flag3=0;
		for(int i=1;i<=1000;i++)
		{ int flag=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				flag++;
		}
		if(flag<3)
			flag3++;
	
	}
	System.out.println("prime: "+flag3);
	
}
public static void main(String []args)
	{ 
	 armstrong();
	 palidrome();
	prime();
	}
}
	