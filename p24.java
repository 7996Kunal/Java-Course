import java.util.Scanner;
class A
{
	public static void main(String bb[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius:");
		double r=sc.nextDouble();
		double a=Math.PI*r*r;
		System.out.println(a);
	}
}