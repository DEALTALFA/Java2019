import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class list extends Applet implements ActionListener
{
	//<applet code="list.class" width=900 height=400 ></applet>
	List l3,l2;
	String str="current state:";
	int j;
		public void init()
	{	
	l3=new List(2,true);
	l2=new List(2,true);
	add(l2);
	add(l3);
	l2.add("opera");
	l2.add("chrome");
	l2.add("saloris");
	l3.add("sick");
	l3.add("luck");
	l3.add("sal");
	l2.addActionListener(this);
	l3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{		
		String idx[]=l2.getSelectedItems();
		str="current state:";
		for(String a:idx)
			str+=a;	
			repaint();		    
	}
	public void paint(Graphics g)
	{	
		
		g.drawString(str,20,100);
	}
}