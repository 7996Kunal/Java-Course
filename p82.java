import java.awt.*;
class Frame1 extends Frame
{
	Button b=new Button("OK");
	TextField t1;
	Frame1()
	{
		Dimension d1=new Dimension(500,400);
		setLayout(null);
		setSize(d1);
		//Point p=new Point(300,50);
		//setLocation(p);
		setLocation(new Point(300,50));
		setBackground(new Color(200,150,200));

		b.setBounds(50,50,150,30);
		add(b);
		t1=new TextField();
		t1.setBounds(210,50,150,30);
		add(t1);
	}
	void f1()
	{

	}
	void f2()
	{

	}
}
class p82
{
	public static void main(String[] bb)
	{
		//Frame1 f=new Frame1();
		//f.setVisible(true);
		new Frame1().setVisible(true);
	}
}
