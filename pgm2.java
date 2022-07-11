//method local inner class:

class Outer{
	void outerMethod(){
		System.out.println("Inside ouer Method");
		//inner class is local to outerMetihd()
		class Inner{
			void InnerMethod()
			{
				System.out.println("Inside InnerMethod");
			}
		}
		Inner y=new Inner();
		y.InnerMethod();
	}
}
class pgm2{
	public static void main(String[] args){
	Outer x=new Outer();
	x.outerMethod();
	}
}
