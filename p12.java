import java.util.Scanner;
class A
{
	public static void main(String bb[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int x=s1.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(x+"x"+i+"="+x*i);
		}
	}
}
