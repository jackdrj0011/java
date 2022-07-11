//No:2
//pgm Name:StdentRecord
//21-3-22
//David
class Student
{
	int rollno;
	String name;
	void insertRecord(int r, String n)
	{
		rollno=r;
		name=n;
	}
void displayinformation()
{
	System.out.println(rollno+" "+name);
}
}
class Studentrecord
{
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.insertRecord(111,"karan");
		s2.insertRecord(222,"Aryan");
		s1.displayinformation();
		s2.displayinformation();
	}
}	
