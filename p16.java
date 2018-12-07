import java.util.Scanner;
class A
{
	public static void main(String bb[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int k=n;
		int m=0;
		while(n>0)
		{
			int d=n%10;
			m=m*10+d;
			n=n/10;
		}
		if(k==m)
			System.out.println("Palindrome");		
		else
			System.out.println("Not Palindrome");	
	}
}