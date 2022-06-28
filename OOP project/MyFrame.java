import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
class MyFrame extends Frame
{
	//Component
	Button b1;
	MenuBar mb1;
	Menu m1;
	MenuItem mi1,mi2,mi3;
		
	//MyActionListener ml = new MyActionListener(this);
	
	MyFrame(String s)
	{
		super(s);
		this.setBounds(0, 0, 600, 700);
		setLayout(null);
		
		//Initialized Components
		
		b1 = new Button("ABC ENTERPRISE");
		mb1 = new MenuBar();
		m1 = new Menu("PRODUCTS");
		mi1 = new MenuItem("PRODUCT-1");
		mi2 = new MenuItem("PRODUCT-2");
		mi3 = new MenuItem("PRODUCT-3");
		
		//Set Component
		b1.setBounds(100,150,400,100);
		
		Font f1 = new Font("Arial",Font.BOLD,35);
		Font f2 = new Font("Times new Roman",Font.ITALIC,20);
		//SetFont
		b1.setFont(f1);
		mi1.setFont(f2);
		mi2.setFont(f2);
		mi3.setFont(f2);
		
		//Add Components
		add(b1);
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		mb1.add(m1);
		setMenuBar(mb1);
		
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
		MyFrame mf = new MyFrame("My First Frame");
		mf.setVisible(true);
	}
}