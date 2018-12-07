import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Frame1 extends JFrame
{
	Button b1=new Button("OK");
	JButton b2=new JButton("OK");
	Frame1()
	{
		setLayout(null);
		setSize(410,250);
		setResizable(false);
		setTitle("Calculator");
		//addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//setDefaultCloseOperation(HIDE_ON_CLOSE);
		b1.setBounds(50,50,30,30);add(b1);
		b2.setBounds(50,100,60,30);add(b2);
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b1_Click(e);}});
		b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){b2_Click(e);}});
	}
	void b1_Click(ActionEvent e)
	{
		//JOptionPane.showMessageDialog(this,"Hello");
		//int x=JOptionPane.showConfirmDialog(this,"Are you sure?");
		//x=0, Yes; 1 ,No; 2,Cancel
		String s=JOptionPane.showInputDialog(this,"Your Name:");
	}
	void b2_Click(ActionEvent e)
	{
		new Frame2().setVisible(true);
	}
}
class Frame2 extends JFrame
{
	Frame2()
	{
		setSize(500,500);
	}
}
class p96
{
	public static void main(String[] bb)
	{
		//Frame1 f=new Frame1();
		//f.setVisible(true);
		new Frame1().setVisible(true);
	}
}

