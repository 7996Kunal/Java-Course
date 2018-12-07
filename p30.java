import java.util.Scanner;
class A
{
	public static void main(String[] bb)
	{
		String s1="A Quick Brown Fox Jumps over the LAZY Dog";
		String s2=s1.replace("o","ABC");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		String[] arr=s1.split("o");
		for(String item:arr)
		{
			System.out.println(item);
		}
	}
}