class A
{
	public void display()
	{
		System.out.println("This is an example of public access specifier");
	}
}
class b
{
	public static void main(String args[])
	{
	A obj=new A();
	obj.display();
	}
}
