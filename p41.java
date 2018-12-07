import java.util.Scanner;
class A
{
	public static void main(String[] bb)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=sc.nextLine();
		int n=s.length();
		String[] arr=s.split(" ");
		int m=arr.length;
		int k=0;
		for(int i=0;i<n;i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='A' ||c=='e' || c=='E' ||c=='i' || c=='I' ||c=='o' || c=='O' ||c=='u' || c=='U')
			{
				k++;
			}
		}
		System.out.println("Total Words:"+m);
		System.out.println("Total Characters:"+n);
		System.out.println("Total Vowels:"+k);
	}
}