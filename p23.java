import java.util.Scanner;
class A
{
	public static void main(String bb[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		double d=sc.nextDouble();
		d=Math.toRadians(d);
		double d1=Math.sin(d);
		System.out.println(d1);
	}
}