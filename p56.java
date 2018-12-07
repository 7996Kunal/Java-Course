class Shape
{
	void area()
	{
	}
}
class Circle extends Shape
{
	void area()
	{
		System.out.println("Area of Circle");
	}
}
class Ellipse extends Shape
{
	void area()
	{
		System.out.println("Area of Ellipse");
	}
}
class Rectangle extends Shape
{
	void area()
	{
		System.out.println("Area of Rectangle");
	}
}
class p56
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
	}
}
