import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class form extends Applet implements ActionListener
{
	//<applet code="form.class" width=1000 height=500></applet>
	Button b1;
	Checkbox cb1,cb2;
	CheckboxGroup cbg1;
	TextField tf1;
	Choice c1;
	Label Lab2,Lab5;
	List L1;
	TextArea ta1;
	public void init()
	{	setLayout(null);
		ta1=new TextArea();
		ta1.setBounds(550,50,400,400);
		Lab2=new Label("Enter name");
		Lab2.setBounds(10,10,80,20);
		add(Lab2);
		tf1=new TextField(30);
		tf1.setBounds(100,10,150,20);
		b1=new Button("Submit");
		b1.setBounds(400,450,100,30);
		cbg1=new CheckboxGroup();
		cb1=new Checkbox("Male",cbg1,false);
		cb2=new Checkbox("Female",cbg1,false);
		add(ta1);
		Label Lab3=new Label("Gender");
		Lab3.setBounds(10,40,80,20);
		add(Lab3);
		cb1.setBounds(90,45,43,20);
		add(cb1);
		cb2.setBounds(140,45,50,20);
		add(cb2);
		Label Lab4 =new Label("Choose university:");
		Lab4.setBounds(10,70,110,20);
		add(Lab4);
		c1=new Choice();
		c1.add("GEU");
		c1.select(0);
		c1.add("GEHU");
		add(c1);
		c1.setBounds(120,70,80,20);
		Lab5=new Label("Course:");
		Lab5.setBounds(10,100,50,20);
		add(Lab5);
		L1=new List();
		L1.add("BCA");
		L1.add("MCA");
		L1.add("BBA");
		L1.add("HM");
		L1.add("CA");
		L1.add("BTECH");
		L1.add("MTECH");
		L1.select(0);
		L1.setBounds(70,100,80,50);
		add(L1);
		add(tf1);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{	
		ta1.setText(tf1.getText()+"\n"+cbg1.getSelectedCheckbox().getLabel()+"\n");
		ta1.append(c1.getSelectedItem()+"\n"+L1.getSelectedItem());
		
		
	}
	
}