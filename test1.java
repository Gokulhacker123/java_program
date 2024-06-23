import java.util.*;


class smallest 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.print("Enter 'a' value :");
		int a=sc.nextInt();	
		
		System.out.print("Enter 'b' value :");
		int b=sc.nextInt();
		
		System.out.print("Enter 'c' value :");
		int c=sc.nextInt();
		
		System.out.print("Enter 'd' value :");
		int d=sc.nextInt();
		
		if (a<b && a<c && a<d)
		{
			System.out.println(a+"is the smallest");
		}
		else if (b<c && b<d)
		{
			System.out.println(b+"is the smallest");
		}
		else if (c<d)
		{
			System.out.println(c+"is the smallest");
		}
		else
			System.out.println(d+"is the smallest");
   }
   }
                         