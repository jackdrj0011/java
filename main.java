//No.1
//pgm Name:main
//21-3-22
//David
class Student
{
	int id;
	String name;
}
class main
{
	int id;
	String name;
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.id=101;
		s1.name="DAVID";
		s2.id=232;
		s2.name="Binu";		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}
}
