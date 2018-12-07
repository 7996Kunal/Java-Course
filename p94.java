import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
{
	TextField t1=new TextField();
	Choice c1=new Choice();
	List l1=new List();
	List l2=new List();
	Checkbox ch1=new Checkbox("Visible",true);
	Checkbox ch2=new Checkbox("Disable");
	Button b1=new Button("OK");
	Frame1()
	{
		setLayout(null);
		setSize(500,400);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		t1.setBounds(20,40,150,25);add(t1);
		c1.setBounds(20,70,150,25);add(c1);
		b1.setBounds(180,40,150,30);add(b1);
		l1.setBounds(20,120,150,200);add(l1);
		l2.setBounds(180,120,150,200);add(l2);
		ch1.setBounds(180,330,100,25);add(ch1);
		ch2.setBounds(180,360,100,25);add(ch2);
		b1.addMouseListener(new MouseAdapter(){public void mouseEntered(MouseEvent e){b1MouseEnter();}});
		b1.addMouseListener(new MouseAdapter(){public void mouseExited(MouseEvent e){b1MouseExit();}});
		ch1.addItemListener(new ItemListener(){public void itemStateChanged(ItemEvent e){ch1Checked();}});
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){b1Click();}});
		c1.addItemListener(new ItemListener(){public void itemStateChanged(ItemEvent e){c1Select();}});
	}
	void c1Select()
	{
		String s=c1.getSelectedItem();
		l1.add(s);
	}
	void b1Click()
	{
		String s=t1.getText();
		c1.add(s);
		t1.setText("");
		t1.requestFocus();
	}
	void ch1Checked()
	{
		boolean b=ch1.getState();
		if(b)
			b1.setVisible(true);
		else
			b1.setVisible(false);
	}
	void b1MouseEnter()
	{
		b1.setBackground(new Color(150,200,150));
	}
	void b1MouseExit()
	{
		b1.setBackground(new Color(50,200,250));
	}
}
class p94
{
	public static void main(String[] bb)
	{
		//Frame1 f=new Frame1();
		//f.setVisible(true);
		new Frame1().setVisible(true);
	}
}

