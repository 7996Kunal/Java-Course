import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame
{
	Label l1=new Label("Name:");
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextArea t3=new TextArea();
	Button b1=new Button("OK");
	Choice ch=new Choice();
	List lst=new List();
	Checkbox c1=new Checkbox("Cricket");
	Checkbox c2=new Checkbox("Hockey");
	Checkbox c3=new Checkbox("Football",true);
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox c4=new Checkbox("MBA",true,cbg);
	Checkbox c5=new Checkbox("MCA",false,cbg);
	Checkbox c6=new Checkbox("MTech",false,cbg);
	Scrollbar sc=new Scrollbar();
	Frame1()
	{
		setLayout(null);
		setSize(400,600);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		l1.setBounds(20,50,70,25);add(l1);
		l1.setFont(new Font("Arial",0,20));
		t1.setBounds(100,50,200,25);add(t1);
		t2.setBounds(100,80,200,25);add(t2);
		t3.setBounds(100,110,200,80);add(t3);
		b1.setBounds(100,200,200,30);add(b1);
		t2.setEchoChar('$');
		ch.setBounds(100,240,200,30);add(ch);
		ch.add("Item 1");ch.add("Item 2");ch.add("Item 3");
		ch.add("Item 4");ch.add("Item 5");ch.add("Item 6");
		lst.setBounds(100,280,200,70);add(lst);
		lst.add("Item 1");lst.add("Item 2");lst.add("Item 3");
		lst.add("Item 4");lst.add("Item 5");lst.add("Item 6");
		c1.setBounds(100,360,70,30);add(c1);
		c2.setBounds(170,360,70,30);add(c2);
		c3.setBounds(240,360,70,30);add(c3);
		c4.setBounds(100,400,70,30);add(c4);
		c5.setBounds(170,400,70,30);add(c5);
		c6.setBounds(240,400,70,30);add(c6);
		sc.setBounds(20,100,30,300);add(sc);
	}
}
class p90
{
	public static void main(String[] bb)
	{
		//Frame1 f=new Frame1();
		//f.setVisible(true);
		new Frame1().setVisible(true);
	}
}
