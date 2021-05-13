//overloading

interface I
{
 public abstract void show();

}
class B implements I
{
	public void show()
	{
		System.out.println("class B");	
	}	
	
}

class A extends B 
{
 public void show()
{
System.out.println("class A");
}
public static void main(String []args)
{ B b=new B();
 A a=new A();
 a.show();
 b.show();
}

}