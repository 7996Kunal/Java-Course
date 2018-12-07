import java.util.Scanner;
class A
{
	public static void main(String[] bb)
	{
		String s1="A Quick Brown Fox Jumps over the LAZY Dog";
		int p=s1.indexOf("o");
		while(p>=0)
		{
			System.out.println(p);
			p=s1.indexOf("o",p+1);
		}
	}
}