class InvalidAgeException extends RuntimeException
{
	public String toString()
	{
		return "InvalidAgeException:Valid age is between 18 and 50";
	}
}
class p65
{
	public static void main(String[] bb)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter Age of the Employee:");
		int a=sc.nextInt();
		if(a<18 || a>50)
		{
			System.out.println("Age Problem");
			InvalidAgeException e=new InvalidAgeException();
			throw e;
		}
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");
		System.out.println("Statement 4");
	}
}
