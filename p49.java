class A
{
	void f1()
	{
		System.out.println("Zero Parameter");
	}
	void f1(int a)
	{
		System.out.println("1 Integer Parameter");
	}
	void f1(double d)
	{
		System.out.println("1 Double Parameter");
	}
	void f1(float d)
	{
		System.out.println("1 Float Parameter");
	}
}
class p49
{
	public static void main(String[] bb)
	{
		byte x1=23;
		short x2=34;
		int x3=45;
		long x4=56;
		float x5=23.45F;
		double x6=23.67;
		String x7="ABC";
		boolean x8=true;
		char x9='A';
		A a=new A();
		a.f1();
		a.f1(x1);
		a.f1(x2);
		a.f1(x3);
		a.f1(x4);
		a.f1(x5);
		a.f1(x6);
		//a.f1(x7);
		//a.f1(x8);
		a.f1(x9);
		//a.f1(23,67);
	}
}
