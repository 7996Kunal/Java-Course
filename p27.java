import java.util.Scanner;
class A
{
	public static void main(String[] bb)
	{
		String s1="A Quick Brown Fox Jumps over the LAZY Dog";
		int n=s1.length();
		String s2=s1.toLowerCase();
		String s3=s1.toUpperCase();
		char c=s1.charAt(10);
		String s4=s1.substring(10);
		String s5=s1.substring(10,20);
		System.out.println(s1);
		System.out.println(n);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(c);
		System.out.println(s4);
		System.out.println(s5);
	}
}