class A
{
	public String toString()
	{
		return "Hello";
	}
}
class p46
{
	public static void main(String[] bb)
	{
		A a1=new A();
		A a2=new A();
		A a3=new A();
		A a4=new A();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		String s1=a1.toString();
		String s2=a2.toString();
		String s3=a3.toString();
		String s4=a4.toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
