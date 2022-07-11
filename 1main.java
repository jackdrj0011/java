class Outer{
	class Inner{
		public void show(){
		System.out.println("In a nested class method");
		}
	}
}
class 1main{
	public static void main(String args[])
	{
		Outer.Inner in=new Outer().new
		Inner();
		in.show();
	}
}
