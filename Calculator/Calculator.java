import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;


class calc extends Frame
{
	Frame f = new Frame();
	JLabel display = new JLabel("",JLabel.RIGHT);
	JLabel mode = new JLabel("Standard Mode");
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");

	JButton dot = new JButton(".");
	JButton add = new JButton("+");
	JButton sub = new JButton("-");
	JButton mul = new JButton("\u00D7");
	JButton div = new JButton("\u00F7");
	JButton eql = new JButton("\u003D");
	JButton clr = new JButton("C");
	JButton clrAll = new JButton("CE");
	JButton del = new JButton("\u2190");
	JButton mod = new JButton("\u0025");
	JButton sqrt = new JButton("\u221A");
	JButton sqr = new JButton("x\u00B2");
	JButton mul_invrs = new JButton("\u00B9/x");
	JButton plus_minus = new JButton("\u00B1");

	calc()
	{
		setLayout(null);
		setBounds(950,60,315,520);
		setResizable(false);
		setBackground(new Color(215,215,215));
		setTitle("Calculator");
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent evnt){System.exit(0);}});

		mode.setBounds(50,50,250,30); add(mode);mode.setFont(new Font("Arial",2,30));
		display.setBounds(20,120,260,70); add(display);/*display.setBackground(new Color(211,211,211))*/;display.setFont(new Font("Arial",2,30));

		b0.setBounds(85,465,70,50);add(b0); b0.setFont(new Font("Times New Roman",2,18));b0.setBackground(new Color(255,255,255)); b0.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		b1.setBounds(10,410,70,50);add(b1); b1.setBackground(new Color(255,255,255)); b1.setFont(new Font("Times New Roman",2,30));b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		b2.setBounds(85,410,70,50);add(b2); b2.setBackground(new Color(255,255,255)); b2.setFont(new Font("Times New Roman",2,30));b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		b3.setBounds(160,410,70,50);add(b3); b3.setBackground(new Color(255,255,255)); b3.setFont(new Font("Times New Roman",2,30));b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		b4.setBounds(10,355,70,50);add(b4); b4.setBackground(new Color(255,255,255)); b4.setFont(new Font("Times New Roman",2,30));b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		b5.setBounds(85,355,70,50);add(b5); b5.setBackground(new Color(255,255,255)); b5.setFont(new Font("Times New Roman",2,30));b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		b6.setBounds(160,355,70,50);add(b6); b6.setBackground(new Color(255,255,255)); b6.setFont(new Font("Times New Roman",2,30));b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		b7.setBounds(10,300,70,50);add(b7);  b7.setBackground(new Color(255,255,255)); b7.setFont(new Font("Times New Roman",2,30));b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		b8.setBounds(85,300,70,50);add(b8);b8.setBackground(new Color(255,255,255)); b8.setFont(new Font("Times New Roman",2,30));b8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
	    b9.setBounds(160,300,70,50);add(b9);b9.setBackground(new Color(255,255,255)); b9.setFont(new Font("Times New Roman",2,30));b9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});

		plus_minus.setBounds(10,465,70,50);add(plus_minus); plus_minus.setFont(new Font("Times New Roman",2,18));plus_minus.setBackground(new Color(211,211,211));//add.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		eql.setBounds(235,465,70,50);add(eql); eql.setFont(new Font("Times New Roman",2,30)); eql.setBackground(new Color(211,211,211));eql.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){on_equals();}});
	    dot.setBounds(160,465,70,50);add(dot); dot.setFont(new Font("Times New Roman",2,30)); dot.setBackground(new Color(211,211,211));dot.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		add.setBounds(235,410,70,50);add(add); add.setFont(new Font("Times New Roman",2,30)); add.setBackground(new Color(211,211,211));add.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		sub.setBounds(235,355,70,50);add(sub); sub.setFont(new Font("Times New Roman",2,30)); sub.setBackground(new Color(211,211,211));sub.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		mul.setBounds(235,300,70,50);add(mul); mul.setFont(new Font("Times New Roman",2,30)); mul.setBackground(new Color(211,211,211));mul.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		div.setBounds(235,245,70,50);add(div); div.setFont(new Font("Times New Roman",2,30)); div.setBackground(new Color(211,211,211));div.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		clrAll.setBounds(10,245,70,50);add(clrAll); clrAll.setFont(new Font("Times New Roman",2,25)); clrAll.setBackground(new Color(211,211,211));
		clr.setBounds(85,245,70,50);add(clr); clr.setFont(new Font("Times New Roman",2,25)); clr.setBackground(new Color(211,211,211));
		del.setBounds(160,245,70,50);add(del); del.setFont(new Font("Times New Roman",2,30)); del.setBackground(new Color(211,211,211));
		mod.setBounds(10,190,70,50);add(mod); mod.setFont(new Font("Times New Roman",2,30)); mod.setBackground(new Color(211,211,211));mod.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
	    sqrt.setBounds(85,190,70,50);add(sqrt); sqrt.setFont(new Font("Times New Roman",2,30)); sqrt.setBackground(new Color(211,211,211));sqrt.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		sqr.setBounds(160,190,70,50);add(sqr); sqr.setFont(new Font("Times New Roman",2,30)); sqr.setBackground(new Color(211,211,211));//sqr.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
		mul_invrs.setBounds(235,190,70,50);add(mul_invrs); mul_invrs.setFont(new Font("Times New Roman",2,30));mul_invrs.setBackground(new Color(211,211,211));//mul_invrs.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){onclick(e);}});
	}

	void onclick(ActionEvent ee)
	{

		display.setText(display.getText()+ee.getActionCommand());
	}
	void on_equals()
	{
		String s = display.getText();
		if(s.contains("+"))
		{
			//String s = display.getText();
			int opr = s.indexOf("+");
			String s1 = s.substring(0,opr);
			String s2 = s.substring(opr+1);
			double ans = Double.parseDouble(s1)+Double.parseDouble(s2);
			display.setText(ans+"");
		}
		else if(s.contains("-"))
		{
			int opr = s.indexOf("-");
			String s1 = s.substring(0,opr);
			String s2 = s.substring(opr+1);
			double ans = Double.parseDouble(s1)-Double.parseDouble(s2);
			display.setText(ans+"");
		}
		else if(s.contains("\u00D7"))
		{
			int opr = s.indexOf("\u00D7");
			String s1 = s.substring(0,opr);
			String s2 = s.substring(opr+1);
			double ans = Double.parseDouble(s1)*Double.parseDouble(s2);
			display.setText(ans+"");
		}
		else if(s.contains("\u00F7"))
		{
			int opr = s.indexOf("\u00F7");
			String s1 = s.substring(0,opr);
			String s2 = s.substring(opr+1);
			double ans = Double.parseDouble(s1)/Double.parseDouble(s2);
			display.setText(ans+"");
		}

	}
}

class Calculator
{
	public static void main (String []args)
	{
		new calc().setVisible(true);
	}
}

