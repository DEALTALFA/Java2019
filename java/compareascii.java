class compareascii
{ 
 public static void main(String []args)
 { 
	int  max=97,min=122,MAX=65,MIN=90;
		
	 String str="BbYy";
	 System.out.println((int)('b'));
	 
	 for(int i=0;i<str.length();i++)
	 {
		 if(Character.isUpperCase(str.charAt(i)))
		 { 
			 if(str.charAt(i)>MAX)
			 {
				MAX=str.charAt(i);
				
			 }
			 if(str.charAt(i)<MIN)
			 {	 
				MIN=str.charAt(i);
			 }
		 }
		 if(Character.isLowerCase(str.charAt(i)))
		 {
			 if(str.charAt(i)>max)
			 { 
		 max=str.charAt(i);
			 }
			 if(str.charAt(i)<min)
			 {
				 min=str.charAt(i);
			 }
		 }
		 
	 }
	 System.out.println("MAX"+MAX+"\tMIN"+MIN);
	 System.out.println("max"+max+"\tmin"+min);
 }
}