import java.util.*;
public class stringfun{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter you name: ");
		String str=sc.nextLine();
		System.out.println("\nEntered name is: "+str+"\n");
		System.out.println("\nLegnth of the inputted string is: "+str.length()+"\n");
		String s1="Hello";
		String s2=s1.concat(str);
		System.out.println("\nAfter concatinating the string is: "+s2+"\n");
		String s3="Java";
		String restr=str.replace(str,s3);
		System.out.println("\nReplaced the string"+str+"to"+restr+"\n");
		String s4=s1.concat(restr);
		System.out.println("\nAfter replacing the string is: "+s4+"\n");
		}
}
