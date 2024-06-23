import java.util.*;
class charvalue 
{
	
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter A character :");
		
		char ch=sc.next().charAt(0);
		int asc=(int)ch;
		
		System.out.println("ASCII value of "+ch+" is:"+asc);

		
		
	}
}
