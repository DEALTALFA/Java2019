import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class applet2 extends Applet implements ActionListener
{
	//<applet code="applet2.class" width=200 height=400 ></applet>
	Button b1,b2,b3,b4,b5;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	Label lb1,lb2;
	
	public void init()
	{
		lb1 = new Label("Enter Number for a ");
		tf1 = new TextField(20);
		lb2 = new Label("Enter Number for b ");
		tf2 = new TextField(20);
		
		/*b1 = new Button("Addition");
		b1.addActionListener(this);
		tf3 = new TextField("Answer ",20);
		b2=new Button("Subtraction");
		b2.addActionListener(this);
		tf4 = new TextField("Answer ",20);
		b3=new Button("Dividion");
		b3.addActionListener(this);
		tf5 = new TextField("Answer ",20);
		b4=new Button("Multiplication");
		b4.addActionListener(this);
		tf6 = new TextField("Answer ",20);
		b5=new Button("Modulus");
		b5.addActionListener(this);
		tf7=new TextField("Answer",20);*/
		add(lb1);
		add(tf1);
		add(lb2);
		add(tf2);
		add(b1);
		add(tf3);
		add(b2);
		add(tf4);
		add(b3);
		add(tf5);
		add(b4);
		add(tf6);
		add(b5);
		add(tf7);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a,b;
		a=Integer.parseInt(tf1.getText());
		b=Integer.parseInt(tf2.getText());
		if(ae.getSource()==b1)
			tf3.setText(String.valueOf(a+b));
		if(ae.getSource()==b2)
			tf4.setText(String.valueOf(a-b));
		if(ae.getSource()==b3)
			tf5.setText(String.valueOf((float)a/b));
		if(ae.getSource()==b4)
			tf6.setText(String.valueOf(a*b));
		if(ae.getSource()==b5)
			tf7.setText(String.valueOf(a%b));
			
	}
}