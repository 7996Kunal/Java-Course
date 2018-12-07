class Student
{
	String name;
}
class A
{
	public static void main(String bb[])
	{
		int x,y;
		x=50;
		y=x;
		y=100;
		System.out.println(x);		
		System.out.println(y);
		Student s1,s2;
		s1=new Student();
		s1.name="Amit";
		s2=s1;
		s2.name="Rajat";
		System.out.println(s1.name);
		System.out.println(s2.name);
	}
}
