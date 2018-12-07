import java.util.Scanner;
class A
{
	public static void main(String... bb)
	{
		int[] x={1,2,3,4};
		int[] y={1,2,3,4,5,6,7,8};
		f1(y);
		f1(34,67);
		f1(45,67,89);
		f1(12);
		f1(12,34,57,9,45,12,34,68,980,90);
	}
	static void f1(int... a)
	{
		System.out.println("Length is "+a.length);
		System.out.println();
		for(int item:a)
		{
			System.out.print(item+"  ");
		}
	}
}