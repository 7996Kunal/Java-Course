import java.util.Scanner;
class A
{
	public static void main(String[] bb)
	{
		Scanner sc=new Scanner(System.in);
		int[][] x=new int[3][5];
		System.out.println("Enter 3x5 Matrix:");
		for(int i=0;i<x.length;i++)
		{
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