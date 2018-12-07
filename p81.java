import java.awt.*;
class p81
{
	public static void main(String[] bb)
	{
		Frame f=new Frame();
		f.setLayout(null);
		Dimension d=new Dimension(400,300);
		f.setSize(d);
		Point p=new Point(400,50);
		f.setLocation(p);
		Color c=new Color(255,120,200);
		f.setBackground(c);
		Button b=new Button();
		b.setSize(150,30);
		b.setLocation(100,50);
		f.add(b);
		TextField t1=new TextField();
		t1.setBounds(100,90,150,30);
		f.add(t1);
		f.setVisible(true);
	}
}
