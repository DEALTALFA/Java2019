import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class radioButton extends Applet implements ItemListener
{
	//<applet code="radioButton.class" width=900 height=400 ></applet>
	Checkbox cb1,cb2;
	CheckboxGroup cbg;
	String str="";
	
		public void init()
	{	
		cbg=new CheckboxGroup();
	    cb1=new Checkbox("winxp",cbg,false);
		cb1.addItemListener(this);
	    cb2=new Checkbox("win7",cbg,false);
		cb2.addItemListener(this);
		add(cb1);
		add(cb2);
	}
	public void itemStateChanged(ItemEvent ie)
	{	
		str="current state:";
		str+=cbg.getSelectedCheckbox().getLabel();
		repaint();		    
	}
	public void paint(Graphics g)
	{
		g.drawString(str,20,200);
	}
}