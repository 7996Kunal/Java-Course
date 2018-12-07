interface A
{
	void f1();
}
class B implements A
{
	public void f1()
	{
		System.out.println("DFD");
	}
}
class p79
{
	public static void main(String[] bb)
	{
		A a=new B();
		a.f1();
	}
}
