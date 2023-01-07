import java.awt.*;
import java.awt.event.*;

class ChoiceTest extends Frame implements ItemListener , ActionListener
{
	Choice c1;
	Label l1;
	Button cmdExit;
	 
	ChoiceTest(String title)
	{
		super(title);
		
		cmdExit = new Button("Exit");
		c1 = new Choice();
		
		c1.addItem("C");
		c1.addItem("C++");
		c1.addItem("VB");
		c1.addItem("JAVA");
		c1.addItem("C#.Net");
		c1.addItem("ASP.Net");
		
		c1.addItemListener(this);
		cmdExit.addActionListener(this);
		Panel p1 = new Panel();
		
		p1.add(c1);
		
		Panel p2 = new Panel();
		l1=new Label("         ");
		l1.setFont(new Font("Arial",Font.BOLD,20));
		p2.add(l1);
		
		Panel p3 = new Panel();
		p3.add(cmdExit);
		
		add(p3,"East");
		this.add(p1,"North");
		this.add(p2,"South");
		
		setSize(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		System.exit(0);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		l1.setText(c1.getSelectedItem());
	}
	public static void main(String args[]) 
	{
		new ChoiceTest("Hey_lack");
	}
}