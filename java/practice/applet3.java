import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class applet3 extends Applet implements ActionListener
{
	//<applet code="applet3.class" width=900 height=400 ></applet>
	Checkbox cb1,cb2;
	Button b1,b2;
	String str="";
	public void init()
	{	
		b1=new Button("click me");
		b1.addActionListener(this);
		add(b1);
	}
	public void actionPerformed(ActionEvent ae)
	{			if(ae.getSource()==b1)
		{  System.out.println("click me");
			//cb1.setLabel("mac pro");
			
			repaint();
			
		}	else
				System.out.println("click me 2");
			
	}
	public void mac()
	{
		b2=new Button("click me 2");
		b2.addActionListener(this);
		add(b2);
	}
	int f=1;
	public void paint(Graphics g)
	{
		f++;
		if(f>2)
		{
			g.drawString("hello",20,150);
		}
	}
}