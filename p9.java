class Student
{
	String name;
	static String college;
	void f1()
	{
		System.out.println(name);
		System.out.println(college);
	}		
	static void f2()
	{
		//System.out.println(name);
		System.out.println(college);
	}		
}
class A
{
	public static void main(String bb[])
	{
		//Student.name="A";
		Student.college="XYZ";
		//Student.f1();
		Student.f2();
		Student s1,s2;
		s1=new Student();
		s2=new Student();
		Student s3=new Student();
		s1.name="A1";
		s2.name="A2";
		s3.name="A3";
		s1.f1();
		s2.f1();
		s3.f1();
		s1.name="B1";
		s1.college="ABC";
		System.out.println(s2.name);
		System.out.println(s2.college);
	}
}
