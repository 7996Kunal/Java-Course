import java.util.Scanner;
class A
{
	public static void main(String bb[])
	{
		Scanner s1=new Scanner(System.in);
		int x,y,z;
		System.out.print("Enter a Number:");
		x=s1.nextInt();
		System.out.print("Enter 2nd Number:");
		y=s1.nextInt();
		System.out.print("Enter 3rd Number:");
		z=s1.nextInt();
		if(x>y && x>z)
			System.out.println(x+" is Largest");
		else if(y>z)
			System.out.println(y+" is Largest");	
		else
			System.out.println(z+" is Largest");
	}
}
