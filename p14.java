import java.util.Scanner;
class A
{
	public static void main(String bb[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		boolean b=false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("NOT Prime");
				b=true;
				break;
			}
		}
		if(!b)
			System.out.println("Prime Number");
		
	}
}