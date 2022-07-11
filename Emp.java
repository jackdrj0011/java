//No:3
//pgm Name:Emp
//21-3-22
//David
class Employee
{
	int empno;
	String name;
	int salary;
	void insertRecord(int r,String n,int s)
	{
		empno=r;
		name=n;
		salary=s;
	}
void displayinformation()
{
	System.out.println(empno+" "+name+" "+salary);
}
}
class Emp
{
	public static void main(String args[])
	{
		Employee s1=new Employee();
		Employee s2=new Employee();
		Employee s3=new Employee();
		s1.insertRecord(111,"karan",12333);
		s2.insertRecord(222,"Aryan",15666);
		s3.insertRecord(333,"Dishu",24555);
		s1.displayinformation();
		s2.displayinformation();
		s3.displayinformation();
	}
}	
