import java.util.Scanner;
class A
{
	public static void main(String[] bb)
	{
		// Valid syntax
		//int x[];
		//x=new int[10];
		//int y[]=new int[10];
		//int z[]={12,34,46,678,90,56,23,24};
		int[] x;
		x=new int[10];
		int[] y=new int[10];
		int[] z={23,45,87,980,56,23,2,56,89};
		Scanner sc=new Scanner(System.in);
		System.out.println(x.length);
		System.out.println(y.length);
		System.out.println(z.length);
		System.out.println("Enter 10 values:");
		for(int i=0;i<y.length;i++)
		{
			y[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+"   ");
		}
		System.out.println();
		for(int item:y)
		{
			System.out.print(item+"   ");
		}
		System.out.println();
		for(int item:z)
		{
			System.out.print(item+"   ");
		}
	}
}