import java.awt.*;
import java.awt.event.*;
class dialog extends Frame
{
	dialog(String title)
	{
		super(title);
	addWindowListener(new WindowAdapter()
	{
	public void windowClosing(WindowEvent we)
	{
		dispose();
	}	
	});
	
	}
}
public class dialog2 extends FileDialog
{
	public static void main(String []args)
	{
		Frame f=new dialog("hello");
		//Dialog dia=new Dialog(f,);
		f.setVisible(true);
		f.setSize(400,400);
		FileDialog fd=new FileDialog(f,"file Dialog",FileDialog.SAVE);
		fd.setVisible(true);
	}
}