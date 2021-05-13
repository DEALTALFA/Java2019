import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class choice extends Applet implements ItemListener
{
	//<applet code="choice.class" width=900 height=400 ></applet>
	Choice c1;
	String str="";
	
		public void init()
	{	
		c1=new Choice();
		c1.add("chrome");
		c1.add("firefox");
		c1.add("opera");
		add(c1);
		c1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{	
		str="current state:";
		
		repaint();	    
	}
	public void paint(Graphics g)
	{	
		str=String.valueOf(c1.getSelectedIndex());
		c1.select("chrome");
		
		g.drawString(str,20,200);
	}
}