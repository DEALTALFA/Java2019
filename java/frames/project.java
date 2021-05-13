import java.awt.*;
import java.awt.event.*;
public class project extends Frame implements ActionListener
{
	Frame f=new Frame("Frame first");
	Button b1,b2;
MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7;
	TextArea TA;
	project()
	{	
		MenuBar mb=new MenuBar();
		Menu m=new Menu("File");
		 mi1=new MenuItem("new");
		 
		 mi2=new MenuItem("open");
		 
		 mi3=new MenuItem("rename");
		 
		 mi4=new MenuItem("close");
		 Menu m2=new Menu("search");
		 mi5=new MenuItem("Find");
		 mi6=new MenuItem("mark");
		 m2.add(mi5);
		 m2.add(mi6);
		m.add(mi1);	
		m.add(mi2);	
		m.add(mi3);
		m.add(mi4);
	
		mb.add(m);
		mb.add(m2);
		f.setMenuBar(mb);
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		TA=new TextArea("",100,100);
		TA.setBounds(10,50,670,650);
		f.add(TA);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
			
		});
		//b.addActionListener(this);
		f.setSize(670,650);
		f.setLayout(null);  
        f.setVisible(true);
	}
	public static void main(String []args)
	{
		 new project();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==mi4)
		{
			f.dispose();
		}
		else if(ae.getSource()==mi1)
		{
			
		}
		else if(ae.getSource()==mi2)
		{
			
		}
		else if(ae.getSource()==mi3)
		{
			
		}
	}
  }