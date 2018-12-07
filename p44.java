import java.util.Scanner;
class A
{
	public static void main(String[] bb)
	{
		Scanner sc=new Scanner(System.in);
		int[][] x=new int[3][4];
		int[][] y=new int[4][5];
		int[][] z=new int[3][5];
		System.out.println("Enter Matrix of 3x4:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Matrix of 4x5:");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				y[i][j]=sc.nextInt();
			}
		}
		//Multiplication
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				for(int k=0;k<4;k++)
				{
					z[i][j]=z[i][j]+(x[i][k]*y[k][j]);
				}
			}
		}
		System.out.println("Result is :");
		for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<5;j++)
			{
				System.out.print(z[i][j]+"  ");
			}
		}
	}
}
