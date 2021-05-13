public class reversestring
{
public static void main(String []args)
{
	reversestring r=new reversestring();
String str="welcome bitches";
String reversed=r.reversestring(str);
System.out.println(reversed);
}
 String reversestring(String str)
{
	
	if(str.isEmpty())
		return str;
	return reversestring(str.substring(1)+str.charAt(0));
}

}