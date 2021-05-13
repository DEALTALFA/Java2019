import java.applet.*;
import java.awt.*;

public class applet1 extends Applet
{
	//<applet code="applet1.class" width=300 height=300></applet>
	
	Color clr = Color.red;
	int f = 0;
	public void init()
	{
		setBackground(clr); 
		setForeground(Color.white);
		System.out.println("init()");
	}
	public void start()
	{
		clr = Color.green;
		f++;
		System.out.println("start()");
	}
	public void paint(Graphics g)
	{
		System.out.println("paint()");
	
		g.drawLine(10,10,100,230);
		//g.fillRect(100,100,300,300);
		//g.drawRect(410,100,300,300);
		//g.drawString("LEARNING GRAPHICS LIBRARY ",750,100);
		if(f>1)
		setBackground(clr);
	}
	public void stop()
	{
		System.out.println("stop()");
	}
	public void destroy()
	{
		System.out.println("destroy()");
	}
}