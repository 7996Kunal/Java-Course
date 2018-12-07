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
class p53
{
	public static void main(String[] bb)
	{
		Emp e=new Emp();
		e.name="Amit";
		e.salary=15000;
		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println();
		Person p;
		p=e;
		System.out.println(p.name);
		System.out.println(p.salary);		// Error
	}
}
