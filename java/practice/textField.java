import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class textField extends Applet implements ActionListener
{
	//<applet code="textField.class" width=900 height=400 ></applet>
	TextField tf1;
	Button b1,b2,b3,b4,b5,b6;
	String str="";
	public void init()
	{	
		
		tf1=new TextField(30);
		add(tf1);
		tf1.setEchoChar('*');
		b1=new Button("settext");
		b1.addActionListener(this);
		add(b1);
		
		b2=new Button("gettext");
		b2.addActionListener(this);
		add(b2);
		
		b3=new Button("getSelectedText");
		b3.addActionListener(this);
		add(b3);
		
		b4=new Button("setEditable");
		b4.addActionListener(this);
		add(b4);
		
		b5=new Button("getEchoChar");
		b5.addActionListener(this);
		add(b5);
			
		b6=new Button("echoCharIsSet");
		b6.addActionListener(this);
		add(b6);
			
	}
	public void actionPerformed(ActionEvent ae)
	{			if(ae.getSource()==b1)
				     tf1.setText("Done");
				 else if(ae.getSource()==b2)
					 System.out.println(tf1.getText());
				 else if(ae.getSource()==b3)
					 System.out.println(tf1.getSelectedText());
				 else if(ae.getSource()==b4)
					 System.out.println(tf1.isEditable());
				else if(ae.getSource()==b5)
					System.out.println(tf1.getEchoChar());
				else if(ae.getSource()==b6)
					System.out.println(tf1.echoCharIsSet());
			
	}
}