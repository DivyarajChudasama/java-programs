import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame extends Frame
{
	Button b1;
	Checkbox c1, c2, c3,c4,c5,c6;
	Font f1;
	MyActionListener ml = new MyActionListener(this);
	MyFrame()
	{
		super("My Test Application");
		setLayout(null);
		setBounds(0,0,1260,1000);
		
		c1 = new Checkbox("Playing");
		c2 = new Checkbox("Dancing");
		c3 = new Checkbox("Singing");
		c4 = new Checkbox("Dancing");
		c5 = new Checkbox("Reading");
		c6 = new Checkbox("Programming");
		b1=new Button("Click");
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(b1);

		c1.setBounds(100,100,400,100);
		c2.setBounds(100,200,400,100);
		c3.setBounds(100,300,400,100);
		c4.setBounds(100,400,400,100);
		c5.setBounds(100,500,400,100);
		c6.setBounds(100,600,400,100);
		b1.setBounds(100,800,400,100);
		
		f1 = new Font("Times",Font.BOLD,50);
		
		c1.setFont(f1);
		c2.setFont(f1);
		c3.setFont(f1);
		c4.setFont(f1);
		c5.setFont(f1);
		c6.setFont(f1);
		
		c1.addItemListener(ml);
		c2.addItemListener(ml);
		c3.addItemListener(ml);
		c4.addItemListener(ml);
		c5.addItemListener(ml);
		c6.addItemListener(ml);
		
		b1.addActionListener(ml);
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
			MyFrame mf = new MyFrame();
			mf.setVisible(true);
	}
}