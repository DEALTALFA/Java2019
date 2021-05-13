class term10String
{
	public static void main(String []args)
	{
		term10String t10=new term10String();
		String result=t10.show("Ram","AlI","123456789",2);
	System.out.println(result);
	}
	String show(String s1,String s2,String num,int index)	//"ram","ali",123456789,2
	{	
		String finale="",small,big;
		if(s1.compareTo(s2)>0)
		{
		big=s1;
		small=s2;}
		else
		{
			big=s2;
		small=s1;
		}	
		char sm=big.charAt(small.length()-1);
		char bg=small.charAt(0);
		if(Character.isUpperCase(bg))
			bg=Character.toLowerCase(bg);
		else
			bg=Character.toUpperCase(bg);
		if(Character.isUpperCase(sm))
			sm=Character.toLowerCase(sm);
		else
			sm=Character.toUpperCase(sm);
		finale=String.valueOf(bg)+String.valueOf(sm);		
		char d = num.charAt(index-1);
		char e = num.charAt(num.length()-index);
		finale =finale+ String.valueOf(d)+String.valueOf(e);		
	    return finale;
	}
}
