import java.util.Scanner;
class A
{
	public static void main(String[] bb)
	{
		Scanner sc=new Scanner(System.in);
		int[][] x=new int[3][];
		x[0]=new int[5];
		x[1]=new int[8];
		x[2]=new int[10];
		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println(x[1].length);
		System.out.println(x[2].length);
		System.out.println();
		for(int i=0;i<x.length;i++)
		{
			System.out.println();
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		for(int[] y:x)
		{
			System.out.println();
			for(int item:y)
			{
				System.out.print(item+"   ");
			}
		}
	}
}