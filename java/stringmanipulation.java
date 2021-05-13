
class stringmanipulation
{
   public static void main(String []args)
	{ 
	 String s="aliali";
    int k;
   for(int i=0;i<s.length();i++)
	   
   {     k=s.indexOf('a',i);
	    if(k-i==0)                           //counting character using indexOf()method
	   {
		    System.out.println(i);
	    }
   }   
        String g[][]={{"sam","man"},{"tan","pan"}};
	   String str[]=new String[4];
	   int l=0;
	   for(String str2[]:g)
		   for(String str3:str2)
		   {
			   str[l]=str3;
			   l++;
		   }
		   for(int i=0;i<str.length;i++)
			  for(int j=0;j<str.length-1;j++)                //sorting using campareTo() method
				  if(str[j].compareTo(str[j+1])>=1)
				  {
					  String temp=str[j];
					  str[j]=str[j+1];
					  str[j+1]=temp;
				  }  
				  for(int i=0;i<str.length;i++)
					  System.out.println(str[i]);
				  
                			   
	 
	       
	   
	}
	
}
