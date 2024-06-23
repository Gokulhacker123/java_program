import java.util.Scanner;

class marks 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the Physics marks");
		double physics=sc.nextDouble;	
		System.out.println("Enter the bio marks");
		double bio=sc.nextDouble;	
		System.out.println("Enter the maths marks");
		double maths=sc.nextDouble;	
		System.out.println("Enter the chemistry marks");
		double chem=sc.nextDouble;	
		System.out.println("Enter the cs marks");
		double cs=sc.nextDouble;
		
		float total= physics+bio+maths+chem+cs;
		float per= total/5;
		
		System.out.println("total marks"+total);
		System.out.println("Percentage"+per);
		
		if (per>=90)
		{
			System.out.println("Grade A");
		}
		else if (per>=80)
		{
			System.out.println("Grade B");
		}
		else if (per>=70)
		{
			System.out.println("Grade C");
		}
		else if (per>=60)
		{
			System.out.println("Grade D");
		}
		else if (per>=50)
		{
			System.out.println("Grade E");
		}
		else if (per>=40)
		{
			System.out.println("Grade F");
		}
		else 
		{
			System.out.println("Grade G");
		}
		
		
		

		
	}
}
