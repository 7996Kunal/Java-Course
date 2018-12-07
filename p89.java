import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
{
	Frame1()
	{
		setLayout(null);
		setSize(400,400);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("Closing");
				//dispose();
				System.exit(0);
			}
		}
		);
	}
}
class p89
{
	public static void main(String[] bb)
	{
		//Frame1 f=new Frame1();
		//f.setVisible(true);
		new Frame1().setVisible(true);
	}
}
