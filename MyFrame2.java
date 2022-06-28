import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame2 extends Frame
{
	Label l1;
	Button b1;
	Checkbox cb1,cb2,cb3,cb4,cb5;
	Font f1;
	//MyActionListener ml = new MyActionListener(this);
	MyFrame2()
	{
		super("Election System");
		setLayout(null);
		setBounds(0,0,1600,1000);
		cb1 = new Checkbox("BJP");
		cb2 = new Checkbox("CONGRESS");
		cb3 = new Checkbox("AAP");
		cb4 = new Checkbox("NCP");
		cb5 = new Checkbox("TMC");
		b1 = new Button("RESULT");
		l1 = new Label("ELECTION SYSTEM");

		l1.setBounds(100,100,400,100);
		cb1.setBounds(500,50,400,100);
		cb2.setBounds(500,300,400,100);
		cb3.setBounds(500,550,400,100);
		cb4.setBounds(500,550,400,100);
		cb5.setBounds(500,550,400,100);
		b1.setBounds(600,700,200,100);
		Font f1 = new Font("Arial",Font.BOLD,30);
		
		l1.setFont(f1);
		cb1.setFont(f1);
		cb2.setFont(f1);
		cb3.setFont(f1);
		cb4.setFont(f1);
		cb5.setFont(f1);
		b1.setFont(f1);

		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(l1);

		add(l4);
		add(b1);

		/*b1.addActionListener(ml);	
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
		b2.addActionListener(ml);	
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});*/
	}
	public static void main(String args[])
	{
			MyFrame2 mf = new MyFrame2();
			mf.setVisible(true);
	}
}