import java.io.*;
public class A1
{	
	public static void main(String[] args)throws IOException
	{
	//Enter data using BufferReader
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader reader=new BufferedReader(ir);
	//BufferReader reader=new Bufferedeader(new InputStreamReader(system.in));
	//Reading data using readLine
	System.out.println("Enter the name");
	String name=reader.readLine();
	//printing to read line
	System.out.println("Your name is "+name);
	}
}
