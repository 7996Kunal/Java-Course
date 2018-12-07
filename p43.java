import java.util.Scanner;
class A
{
	public static void main(String[] bb)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=sc.nextLine();
		char[] ch1=s.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			char c=ch1[i];
			if(c>=65 && c<=90)
			{
				c=(char)(c+32);
			}
			else if(c>=97 && c<=122)
			{
				c=(char)(c-32);
			}
			ch1[i]=c;
		}
		String ss=new String(ch1);
		System.out.println(ss);

	}
}