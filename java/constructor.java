class constructor
{
	int a,b;

	public static void main(String []args)
	{
		constructor obj1=new constructor();
		constructor obj2=obj1;
		System.out.println("called by ob1");
		obj1.display();
		System.out.println("called by ob2");
		obj2.display();
		
	}
	constructor()
	{
		 a=10;
		 b=20;
	}
	constructor(constructor p)
	{
		a=p.b;
		b=p.a;
		
	}
	void display()
	{
		System.out.println("a"+a+"b-"+b);
	}

}