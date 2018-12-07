class A
{
	int x;
	void f1()
	{
		System.out.println("ABC "+x);
	}
}
class p78
{
	public static void main(String[] bb)
	{
		//A a;
		//a=new A();
		new A().x=56;
		new A().f1();

	}
}
