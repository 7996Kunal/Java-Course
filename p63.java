class p63
{
	public static void main(String[] bb)
	{
		int[] arr={435,578,234,123,567,670,312,578};
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int i,x,ans=0;
		System.out.print("Enter array index:");
		try{
			i=sc.nextInt();
			System.out.print("Enter a value:");
			x=sc.nextInt();
			ans=arr[i]/x;
		}catch(ArrayIndexOutOfBoundsException ee)
		{
			System.out.println("Array Index Incorrect, should be less than 8");
		}catch(ArithmeticException ee)
		{
			System.out.println("Second value can't be zero");
		}
		System.out.println("Answer is :"+ans);
	}
}
