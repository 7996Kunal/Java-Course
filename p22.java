import java.util.Scanner;
class A
{
	public static void main(String bb[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		double d=sc.nextDouble();
		//double d1=Math.sqrt(d);
		//double d1=Math.cbrt(d);
		//double d1=Math.log(d);
		//double d1=Math.log10(d);
		//double d1=Math.exp(d);
		double d1=Math.pow(d,5.5);
		System.out.println(d1);
	}
}