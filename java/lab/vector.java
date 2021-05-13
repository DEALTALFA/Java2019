import java.util.Vector;
class vectorc
{
	public static void main(String []args)
	{
		Vector v=new Vector();
		int j=0;
		//adding elements
		v.addElement(112);
		v.addElement(3.46);
		v.addElement("abc");
		v.addElement(94);
		v.addElement(12);
		int p=v.size();
		String fstr="";
		for(int i=0;i<v.size();i++)
		{   
		Object m = v.elementAt(i);//v.elementAt(i) return object   
			if(m instanceof Integer)
		   {
			   String ss = m.toString();   
			   for(j=0;j<ss.length();j++)
			   {
				   Character ch= ss.charAt(j); //picking character from object
				  String temp=ch.toString();
				   if(!fstr.contains(temp))
					   fstr=fstr+temp;
			   }
		   }
		   else if(m instanceof Double)
		   {
			   String ss = m.toString();
			   for(j=0;j<ss.length();j++)
			   {
				   Character ch= ss.charAt(j);
				   //System.out.println();
				  String temp=ch.toString();
						if(temp.equals("."))
						  break;
						if(!fstr.contains(temp))
						{
						  fstr=fstr+temp;
						}
					  
				  					  
		   }
		}
		
	}System.out.println(fstr);
}}