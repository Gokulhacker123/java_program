import java.util.*;

class  thirdlarge
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a value :");
		int a=sc.nextInt();	
		System.out.print("Enter b value :");
		int b=sc.nextInt();		
		System.out.print("Enter c value :");
		int c=sc.nextInt();	
		System.out.print("Enter d value :");
		int d=sc.nextInt();
		
		if ((a>b && a<c && a<d ) || (a<b && a<c && a>d) || (a<b && a>c && a<d))
		{
			System.out.println("a"+a+"is the third largest");
			
		}
		else if ((b>a && b<c && b<d ) || (b<a && b<c && b>d) || (b<a && b>c && b<d))
		{
			System.out.println("b"+b+"is the third largest");
			
		}
		else if ((c>b && c<a && c<d ) || (c<b && c<a && c>d) || (c<b && c>a && c<d))
		{
			System.out.println("c"+c+"is the third largest");
		}
		else
		{
			System.out.println("d"+d+"is the third largest");
		}
		
	}
}
