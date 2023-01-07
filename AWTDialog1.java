import java.awt.*;
import java.awt.event.*;

class AWTDialog1 extends Frame implements ActionListener
{
	Dialog d1,d2;
	Button b1;
	
	public AWTDialog1(String title)
	{
		super(title);
		
		d1 = new Dialog(this);
		d1.setLayout(new FlowLayout());
		d1.setTitle("Dialog 1");
		d1.add(new Label("Enter your name:- "));
		d1.add(new TextField(20));
		d1.setSize(400,400);
		d1.setBackground(Color.GRAY);
		d1.setVisible(true);
		
		d2 = new Dialog(d1,"Simple Dialog");
		d2.setModal(true);
		d2.setSize(350,350);
		d2.setLayout(new FlowLayout());
		d2.setResizable(false);
		d2.setLocationRelativeTo(d1);
		
		b1= new Button("Close");
		d2.add(b1);
		
		d2.add(new Checkbox("CheckBox"));
		d2.addActionListener(this);
		d2.add(new TextField(20));
		d2.setVisible(true);
		
		setSize(400,400);
		setVisible(true);		
	}	
	public void actionPerformed(ActionEvent ae)
	{
		d2.dispose();
	}
	public static void main(String args[])
	{
		new AWTDialog1("Hey_lack");
	}
}