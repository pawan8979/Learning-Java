/*Polymorphism:
- Many behaviour ( same object or reference has differnet behaviours)

1. Compile time polymorhism -- Overloading
	add(int, int)
	add(int, int, int)

2. Run time polymorphism -- Overriding
	A
		add(int,int)
	B
		add(int, int)
*/


class A
{
	public void show()
	{
		System.out.println("in A show");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("in B show");
	}
}

class C extends A
{
	public void show()
	{
		System.out.println("in C show");
	}
}

class D
{
	
}


public class _18Polymorphism{
	public static void main(String[] args) {
//		A obj=new B();
//		obj.show();
		
		A obj=new A();
		obj.show();
		
		obj=new B();
		obj.show();
		
		obj=new C();
		obj.show();
		
//		obj=new D();

	
	}
}
