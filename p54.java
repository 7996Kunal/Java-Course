class Person
{
	String name;
}
class Emp extends Person
{
	int salary;
}
class Student extends Person
{
	String course;
}
class p54
{
	public static void main(String[] bb)
	{
		Emp e=new Emp();
		e.name="Amit";
		e.salary=15000;
		Student s=new Student();
		s.name="Ravi";
		s.course="B.Tech";
		print(e);
		print(s);
	}
	static void print(Person p)
	{
		System.out.println(p.name);
		//System.out.println(p.salary);
		//System.out.println(p.course);
		if(p instanceof Emp)
		{
			Emp e1=(Emp)p;
			System.out.println(e1.salary);
		}
		else
		{
			Student s1=(Student)p;
			System.out.println(s1.course);
		}
	}
}
