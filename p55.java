class A
{
	void f1()
	{
		System.out.println("F1 in A");
	}
}
class B extends A
{
	void f1()
	{
		System.out.println("F1 in B");
	}
	void f2()
	{
		System.out.println("F2 in B");
	}
}
class p55
{
	public static void main(String[] bb)
	{
		B b=new B();
		b.f1();
		b.f2();
		A a=b;
		a.f1();
		//a.f2();
	}
}
