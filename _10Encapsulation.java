class Human
{
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int a)
	{
		age=a;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
}

public class _10Encapsulation {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		obj.SetAge(23);
		obj.setName("Negi");		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}

