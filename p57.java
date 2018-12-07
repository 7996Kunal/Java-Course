abstract class Shape
{
	abstract void area();
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
class Triangle extends Shape
{
}
class p57
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
