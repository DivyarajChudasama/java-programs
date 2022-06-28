import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
class Product3 extends Frame
{
	//Component
	Button b1,b2,b3,b4;
		
	//MyActionListener ml = new MyActionListener(this);
	
	Product3(String s)
	{
		super(s);
		this.setBounds(0, 0, 800, 800);
		setLayout(null);
		
		//Initialized Components
		
		b1 = new Button("PRODUCT - 3");
		b2 = new Button("CUSTOMER DETAIL");
		b3 = new Button("COMPLAINT");
		b4 = new Button("WORKER LIST");
		
		//Set Component
		b1.setBounds(200,100,400,100);
		b2.setBounds(50,300,400,100);
		b3.setBounds(50,450,400,100);
		b4.setBounds(50,600,400,100);
		
		Font f1 = new Font("Arial",Font.BOLD,35);
		Font f2 = new Font("Times new Roman",Font.ITALIC,20);
		//SetFont
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		
		//Add Components
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	
		//When Frames X Button Pressed
		addWindowListener(new WindowAdapter()
			{
				//use closing method Not Closed
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
		Product3 mf = new Product3("My Third Frame");
		mf.setVisible(true);
	}
}