import java.awt.*;


class BorderLayoutDemo extends Frame
{
	Button b1,b2,b3,b4,b5;
	
	BorderLayoutDemo(String title)
	{
		super(title);
		
		b1= new Button("North");
		b2= new Button("South");
		b3= new Button("East");
		b4= new Button("West");
		b5= new Button("Centre");
		
		this.add(b1,"North");
		add(b2,"South");
		add(b3,"East");
		add(b4,"West");
		add(b5,"Center");
		
		 
		this.setSize(300,300);
		setVisible(true);
	}
	public static void main(String args[])
	{
		BorderLayoutDemo b = new BorderLayoutDemo("Hey_lack");
	}
	
}
