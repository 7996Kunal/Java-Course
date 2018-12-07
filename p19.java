class A
{
	public static void main(String bb[])
	{
		B aa=new B();
		int x=100;
		aa.f1(x);
		System.out.println("After Calling:"+x);
		Student s1=new Student();
		s1.name="Rajat";
		aa.f2(s1);
		System.out.println("After Calling:"+s1.name);
	}

}
class B
{
	void f1(int a)
	{
		System.out.println("Recvd:"+a);
		a=50;
		System.out.println("Modified:"+a);
	}
	void f2(Student s)
	{
		System.out.println("Recvd:"+s.name);
		s.name="Amit";
		System.out.println("Modified:"+s.name);
	}
}
class Student
{
	String name;
}
