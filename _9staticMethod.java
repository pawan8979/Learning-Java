//You can only use static variable inside static method
class Mobile
{
	String brand;
	int price;
	static String name;
	
	
	public void show() {
		System.out.println(brand+" : "+price + " : " + name);
	}
	
	// public static void show1(Mobile obj)
	// {
	// 	System.out.println(obj.brand+" : "+obj.price + " : " + name);
		
	// }
	public static void show1()
	{
		System.out.println("in static method");
		
	}
}

public class _9staticMethod {
	public static void main(String[] args) 
	{
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;
        Mobile.name= "Smartphone";
		
		Mobile obj2=new Mobile();
		obj2.brand="Samsung";
		obj2.price=1700;
        Mobile.name= "SmartPhone";

        Mobile.name= "Phone";

		obj1.show();
		obj2.show();
		
		// Mobile.show1(obj1); Indirectly using non static variables inside static method
		Mobile.show1();

	
	}
}


