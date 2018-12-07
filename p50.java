class A
{
	void f1(int a,double b)
	{
		System.out.println("1 Float Parameter");
	}
	void f1(double a,int b)
	{
		System.out.println("1 Float Parameter");
	}
}
class p50
{
	public static void main(String[] bb)
	{
		A a=new A();
		a.f1(123,45.67);
		a.f1(23.45,78);
		a.f1(23,56);
	}
}
