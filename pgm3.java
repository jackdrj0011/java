class Demo{
//method of helper class
void show()
	{
		//print statemet
		System.out.println("In show method if super class");
	}
}
class pgm3{
	//An anonymous class with demo as base class
	static Demo d=new Demo(){
		//method 1
		//show()method
		void show()
		{
			//calling method show() via super keyword
			//which refrs to parent class
			super.show();
			//.print statement
			System.out.println("I am in flavour1Demo class");
		}
	};
	public static void main(String[] args)
	{
		//calling show()methhod inside main()method
		d.show();
	}
}
