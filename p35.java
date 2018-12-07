import java.util.Scanner;
class A
{
	public static void main(String[] bb)
	{
		int[] a={11,12,13,14};
		int[] b={15,16,17,18,19,20};
		int[] c={21,22,23};
		int[][] x={a,b,c};
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
				System.out.print(x[i][j]+"  ");
				//x[i][j]=sc.nextInt();
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