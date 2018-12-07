import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
{
	Scrollbar sc1=new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,260);
	Scrollbar sc2=new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,260);
	Scrollbar sc3=new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,260);
	Label l1=new Label("0");
	Frame1()
	{
		setLayout(null);
		setSize(500,350);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		sc1.setBounds(20,50,460,50);add(sc1);
		sc2.setBounds(20,120,460,50);add(sc2);
		sc3.setBounds(20,190,460,50);add(sc3);
		l1.setBounds(20,260,460,50);add(l1);
		l1.setBackground(new Color(0,0,0));
		sc1.addAdjustmentListener(new AdjustmentListener(){public void adjustmentValueChanged(AdjustmentEvent ee){f1();}});
		sc2.addAdjustmentListener(new AdjustmentListener(){public void adjustmentValueChanged(AdjustmentEvent ee){f2();}});
		sc3.addAdjustmentListener(new AdjustmentListener(){public void adjustmentValueChanged(AdjustmentEvent ee){f3();}});
	}
	void f1()
	{
		int a=sc1.getValue();
		sc1.setBackground(new Color(a,0,0));
	}
	void f2()
	{
		int a=sc2.getValue();
		sc2.setBackground(new Color(0,a,0));
	}
	void f3()
	{
		int a=sc3.getValue();
		sc3.setBackground(new Color(0,0,a));
	}
}
class p93
{
	public static void main(String[] bb)
	{
		//Frame1 f=new Frame1();
		//f.setVisible(true);
		new Frame1().setVisible(true);
	}
}

