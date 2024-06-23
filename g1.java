import java.util.Scanner;



class g1 
{  
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.print("Enter the n value :");
		int n=sc.nextInt();
		
		for (int i=n;i>=1 ;i-- )
		{
			System.out.print(i+" ");
		}
	}
}
