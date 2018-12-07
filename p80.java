interface A
{
	void f1();
}
class p80
{
	public static void main(String[] bb)
	{
		(new A()
		{
			public void f1()
			{
				System.out.println("ABC");
			}
		}
		).f1();
	}
}
