import java.util.*;

class  secondlarge
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter 'a' value");
		int a=sc.nextInt();		
		System.out.print("Enter 'b' value");
		int b=sc.nextInt();		
		System.out.print("Enter 'c' value");
		int c=sc.nextInt();
		
		if ((a>b && a<c) || (a<b && a>c))
		{
			System.out.println(a+"is the Second largest");
			
		}
		else if ((b>a && b<c)|| (b<a && b>c))
		{
			System.out.println(b+"is the Second largest");
			
		}
		else 
		{
			System.out.println(c+"is the second largest");
		}
	}
}
