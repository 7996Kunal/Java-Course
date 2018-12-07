import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
{
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	Button b1=new Button("First");
	Button b2=new Button("Second");
	Button b3=new Button("Third");
	Frame1()
	{
		setLayout(null);
		setSize(400,600);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		t1.setBounds(100,50,200,25);add(t1);
		t2.setBounds(100,80,200,25);add(t2);
		t3.setBounds(100,110,200,25);add(t3);
		b1.setBounds(100,150,200,30);add(b1);
		b2.setBounds(100,190,200,30);add(b2);
		b3.setBounds(100,230,200,30);add(b3);
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent eee){f1();}});
		b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent eee){f2();}});
		b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent eee){f3();}});
	}
	void f1()
	{
		String s1=t1.getText();
		String s2=t2.getText();
		t1.setText(s2);
		t2.setText(s1);
	}
	void f2()
	{
		String s1=t1.getText();
		String s2=t2.getText();
		try{
			int x=Integer.parseInt(s1);
			int y=Integer.parseInt(s2);
			int z=x+y;
			t3.setText(z+"");
		}catch(Exception ee)
		{
			t1.setForeground(new Color(255,0,0));
			t2.setForeground(new Color(255,0,0));
		}
	}
	void f3()
	{
		setBounds(300,40,400,400);
		setBackground(new Color(200,150,200));
		b1.setVisible(false);
		b2.setEnabled(false);
		b3.setBackground(new Color(150,200,250));
	}
}
class p91
{
	public static void main(String[] bb)
	{
		//Frame1 f=new Frame1();
		//f.setVisible(true);
		new Frame1().setVisible(true);
	}
}
