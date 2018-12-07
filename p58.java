interface Shape
{
	abstract void area();
}
class Circle implements Shape
{
	public void area()
	{
		System.out.println("Area of Circle");
	}
}
class Ellipse implements Shape
{
	public void area()
	{
		System.out.println("Area of Ellipse");
	}
}
class Rectangle implements Shape
{
	public void area()
	{
		System.out.println("Area of Rectangle");
	}
}
class Triangle implements Shape
{
}
class p58
{
	public static void main(String[] bb)
	{
		Shape s1,s2,s3;
		s1=new Circle();
		s2=new Ellipse();
		s3=new Rectangle();
		s1.area();
		s2.area();
		s3.area();
		Shape s=new Shape();
	}
}
