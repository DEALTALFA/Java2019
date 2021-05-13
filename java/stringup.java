
class stringup
{
  public static void main(String []args)
  {
	  
    stringup stup=new stringup();
	String q=stup.show("123 1234 aaaaaaa",12);
	System.out.println(q);
	
  }
  String show(String M,int n)
  {
	 String result="";
	
	  int a=n%10;
	  int b=n/10;
	  String res[]=M.split(" ");
	  String x1=res[a-1],x2=res[b-1];
	  int len1=x2.length(),len2=x1.length();
		if(len1%2==0)
		{	String ss1=x2.substring(len1/2,len1);
			String ss2=x2.substring(0,len1/2);
			char ch1[]=ss2.toCharArray();
			char ch2[]=new char[ss2.length()];
			for(int i=0,j=ch1.length-1;i<ch1.length;i++,j--)
			{
				ch2[j]=ch1[i];
			}
			ss2="";
			for(char s:ch2)
			{
				ss2+=s;
			}
			result=result+ss1+ss2;
			System.out.println(result);
			
		}
		else		
		{
			String ss1=x2.substring(len1/2,len1);
			String ss2=x2.substring(0,len1/2+1);
			char ch1[]=ss2.toCharArray();
			char ch2[]=new char[ss2.length()];
			for(int i=0,j=ch1.length-1;i<ch1.length;i++,j--)
			{
				ch2[j]=ch1[i];
			}
			ss2="";
			for(char s:ch2)
			{
				ss2+=s;
			}
			result=result+ss1+ss2;
		}
		if(len2%2==0)
		{
			String ss1=x1.substring(len2/2,len2);
			String ss2=x1.substring(0,len2/2);
			char ch1[]=ss2.toCharArray();
			char ch2[]=new char[ss2.length()];
			for(int i=0,j=ch1.length-1;i<ch1.length;i++,j--)
			{
				ch2[j]=ch1[i];
			}
			ss2="";
			for(char s:ch2)
			{
				ss2+=s;
			}
			result=result+ss1+ss2;
			
		}
		else
		{
			String ss1=x1.substring(len2/2,len2);
			String ss2=x1.substring(0,len2/2+1);
			char ch1[]=ss2.toCharArray();
			char ch2[]=new char[ss2.length()];
			for(int i=0,j=ch1.length-1;i<ch1.length;i++,j--)
			{
				ch2[j]=ch1[i];
			}
			ss2="";
			for(char s:ch2)
			{
				ss2+=s;
			}
			result=result+ss1+ss2;
	    }
		return result;
	 
		 
  }
}
