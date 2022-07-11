class testClass
{
	public int num=100;
	public void printMessage(){System.out.println("Hello java");}
}
public class TestClass
{
	public static void main(String args[])
{
	testClass obj=new testClass();
	System.out.println(obj.num);
	obj.printMessage();
}
}
