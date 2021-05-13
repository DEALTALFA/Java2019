import java.applet.*;
import java.awt.*;
public class appletfirst extends Applet
{
	//<applet code="appletfirst.class" width=400 height=400 ></applet>
	public void init()
	{
		
		System.out.println("init()");
	}
	public void start()
	{
		System.out.println("start()");
	}
	public void paint(Graphics g)
	{	
		setForeground(Color.white);
		setBackground(Color.red);
		
		for(int x=100;x<=400;x+=5)
		{
			g.drawLine(x,100,x,200);
			try
			{
				Thread.sleep(100);
			} catch(Exception e){}
		}
		
		
		System.out.println("paint()");
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