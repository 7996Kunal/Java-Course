import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
{
	Label l1=new Label("",Label.RIGHT);
	Button[] digits=new Button[10];
	Button onac=new Button("ON/AC");
	Button equ=new Button("=");
	Button add=new Button("+");
	Button sub=new Button("-");
	Button mul=new Button("x");
	Button div=new Button("/");
	Button sqrt=new Button("\u221A");
	Button log=new Button("log");
	Button exp=new Button("e^x");
	Button xpy=new Button("x^y");
	Frame1()
	{
		setLayout(null);
		setSize(410,250);
		setResizable(false);
		setTitle("Calculator");
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		l1.setBounds(10,30,390,30);add(l1);
		l1.setBackground(new Color(200,200,200));
		l1.setFont(new Font("Arial",0,25));
		for(int i=0;i<10;i++)
		{
			digits[i]=new Button(i+"");
			digits[i].setSize(35,35);
			add(digits[i]);
			digits[i].addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){digitClick(e);}});
		}
		digits[1].setLocation(200,70);
		digits[2].setLocation(240,70);
		digits[3].setLocation(280,70);
		digits[4].setLocation(200,110);
		digits[5].setLocation(240,110);
		digits[6].setLocation(280,110);
		digits[7].setLocation(200,150);
		digits[8].setLocation(240,150);
		digits[9].setLocation(280,150);
		digits[0].setLocation(280,190);
		onac.setBounds(320,70,80,35);add(onac);
		equ.setBounds(320,190,80,35);add(equ);
		add.setBounds(320,110,35,35);add(add);
		sub.setBounds(360,110,35,35);add(sub);
		mul.setBounds(320,150,35,35);add(mul);
		div.setBounds(360,150,35,35);add(div);
		sqrt.setBounds(160,70,35,35);add(sqrt);
		log.setBounds(160,110,35,35);add(log);
		exp.setBounds(160,150,35,35);add(exp);
		xpy.setBounds(160,190,35,35);add(xpy);
		add.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){oprClick(ee);}});
		sub.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){oprClick(ee);}});
		mul.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){oprClick(ee);}});
		div.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){oprClick(ee);}});
		equ.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){equClick(ee);}});
	}
	void equClick(ActionEvent e)
	{
		String s=l1.getText();
		int p=s.indexOf("+");
		if(p>0)
		{
			String s1=s.substring(0,p);
			String s2=s.substring(p+1);
			double x=Double.parseDouble(s1);
			double y=Double.parseDouble(s2);
			double z=x+y;
			l1.setText(z+"");
		}
		p=s.indexOf("-");
		if(p>0)
		{
			String s1=s.substring(0,p);
			String s2=s.substring(p+1);
			double x=Double.parseDouble(s1);
			double y=Double.parseDouble(s2);
			double z=x-y;
			l1.setText(z+"");
		}
		p=s.indexOf("x");
		if(p>0)
		{
			String s1=s.substring(0,p);
			String s2=s.substring(p+1);
			double x=Double.parseDouble(s1);
			double y=Double.parseDouble(s2);
			double z=x*y;
			l1.setText(z+"");
		}
		p=s.indexOf("/");
		if(p>0)
		{
			String s1=s.substring(0,p);
			String s2=s.substring(p+1);
			double x=Double.parseDouble(s1);
			double y=Double.parseDouble(s2);
			double z=x/y;
			l1.setText(z+"");
		}
	}
	void oprClick(ActionEvent e)
	{
		String s1=l1.getText();
		String s2=e.getActionCommand();
		l1.setText(s1+s2);
	}
	void digitClick(ActionEvent ee)
	{
		String s1=l1.getText();
		String s2=ee.getActionCommand();
		l1.setText(s1+s2);
	}
}
class p95
{
	public static void main(String[] bb)
	{
		//Frame1 f=new Frame1();
		//f.setVisible(true);
		new Frame1().setVisible(true);
	}
}

