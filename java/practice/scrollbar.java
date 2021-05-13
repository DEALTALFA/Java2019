import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class scrollbar extends Applet implements AdjustmentListener
{
	//<applet code="scrollbar.class" width=400 height=400 ></applet>
	Scrollbar sb1;
	String str="current state:";
		public void init()
	{	
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		sb1=new Scrollbar(Scrollbar.VERTICAL,1,0,1,100);
		sb1.addAdjustmentListener(this);
		sb1.setBounds(50,50,30,200);
		add(sb1);		
		setLayout(null);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{		
		str=String.valueOf(sb1.getValue());
			repaint();		    
	}
	public void paint(Graphics g)
	{	
		
		g.drawString(str,20,100);
	}
}