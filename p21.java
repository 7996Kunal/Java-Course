class A
{
	public static void main(String bb[])
	{
		int a;
		a=f1();
		Student s;
		s=f2();
		System.out.println(a);
		System.out.println(s.name);
	}
	static int f1()
	{
		int x=23;
		return x;
	}
	static Student f2()
	{
		Student ss=new Student();
		ss.name="Abhay";
		return ss;
	}
}

class Student
{
	String name;
}
