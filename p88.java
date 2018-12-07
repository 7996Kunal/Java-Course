import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
{
	Frame1()
	{
		setLayout(null);
		setSize(400,400);
		addWindowListener(new WindowListener()
		{
			public void windowOpened(WindowEvent e)
			{
				System.out.println("Open");
			}
			public void windowClosed(WindowEvent e)
			{
				System.out.println("Closed");
			}
			public void windowClosing(WindowEvent e)
			{
				System.out.println("Closing");
				//dispose();
				System.exit(0);
			}
			public void windowIconified(WindowEvent e)
			{
				System.out.println("Icon");
			}
			public void windowDeiconified(WindowEvent e)
			{
				System.out.println("De-Icon");
			}
			public void windowActivated(WindowEvent e)
			{
				System.out.println("Active");
			}
			public void windowDeactivated(WindowEvent e)
			{
				System.out.println("De-Active");
			}
		}
		);
	}
}
class p88
{
	public static void main(String[] bb)
	{
		//Frame1 f=new Frame1();
		//f.setVisible(true);
		new Frame1().setVisible(true);
	}
}
