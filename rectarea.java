import java.util.*;
class rectarea
{
	public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);//System.in is a standard input stream
	System.out.print("Enter length-");
	int l=sc.nextInt();
	System.out.print("Enter breadth-");
	int b=sc.nextInt();
	int a=l*b;
	System.out.println("Area= "+a);
}
}
