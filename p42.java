import java.util.Scanner;
class A
{
	public static void main(String[] bb)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=sc.nextLine();
		char[] ch1=s.toCharArray();
		int n=ch1.length;
		char[] ch2=new char[n];
		int j=0;
		for(int i=n-1;i>=0;i--)
		{
			ch2[j]=ch1[i];
			j++;
		}
		String s1=new String(ch2);
		System.out.println(s);
		System.out.println(s1);
	}
}