import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
{
	Button b1=new Button("OK");
	Button b2=new Button("Cancel");
	Frame1()
	{
		setLayout(null);
		setSize(400,400);
		b1.setBounds(50,50,150,30);
		add(b1);
		b2.setBounds(50,100,150,30);
		add(b2);
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent evt){f1();}});
		b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent evt){f2();}});
	}
	void f1()
	{
		System.out.println("A");
	}
	void f2()
	{
		System.out.println("B");
	}
	void f3()
	{
		System.out.println("C");
	}
}
class p87
{
	public static void main(String[] bb)
	{
		//Frame1 f=new Frame1();
		//f.setVisible(true);
		new Frame1().setVisible(true);
	}
}
