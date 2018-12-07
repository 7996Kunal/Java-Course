import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
{
	//Scrollbar sc1=new Scrollbar(Scrollbar.HORIZONTAL);
	//Scrollbar sc1=new Scrollbar(Scrollbar.HORIZONTAL,100,5,50,300);
	Scrollbar sc1=new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,105);
	Label l1=new Label("0");
	Label l2=new Label("0");
	Frame1()
	{
		setLayout(null);
		setSize(500,300);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		sc1.setBounds(20,100,460,30);add(sc1);
		l1.setBounds(20,150,150,30);add(l1);
		l1.setFont(new Font("Arial",1,24));
		l2.setBounds(20,190,150,30);add(l2);
		l2.setFont(new Font("Arial",1,24));
		sc1.addAdjustmentListener(new AdjustmentListener(){public void adjustmentValueChanged(AdjustmentEvent ee){f1();}});
	}
	void f1()
	{
		int a=sc1.getValue();
		l1.setText(a+" C");
	}
}
class p92
{
	public static void main(String[] bb)
	{
		//Frame1 f=new Frame1();
		//f.setVisible(true);
		new Frame1().setVisible(true);
	}
}

