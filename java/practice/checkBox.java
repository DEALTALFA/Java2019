import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class checkBox extends Applet implements ItemListener
{
	//<applet code="checkBox.class" width=900 height=400 ></applet>
	Checkbox cb1,cb2;
	Button b1;
		public void init()
	{	
	     cb1=new Checkbox("winxp");
		 add(cb1);
		 cb1.addItemListener(this);
	     cb2=new Checkbox("win7");
		 cb2.addItemListener(this);
		add(cb2);
	}
	public void itemStateChanged(ItemEvent ae)
	{			
	repaint();		    
	}
	public void paint(Graphics g)
	{
		String str="current state";
		str="win xp"+cb1.getState();
			g.drawString(str,20,100);
		str="win 7"+cb2.getState();
		g.drawString(str,20,200);
	}
}