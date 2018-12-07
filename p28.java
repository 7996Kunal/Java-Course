import java.util.Scanner;
class A
{
	public static void main(String[] bb)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st string:");
		String s1=sc.nextLine();
		System.out.print("Enter 2nd string:");
		String s2=sc.nextLine();
		if(s1.equals(s2))
			System.out.println("Same");
		else
			System.out.println("Different");

	}
}