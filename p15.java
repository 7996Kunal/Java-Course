import java.util.Scanner;
class A
{
	public static void main(String bb[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("NOT Prime");
				break;
			}
		}
		if(i==n)
			System.out.println("Prime Number");
		
	}
}