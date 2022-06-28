import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame1 extends Frame
{
	TextField t1,t2,t3;
	Label l1,l2,l3,l4;
	Button b1,b2,b3;
	Font f1;
	
	//MyActionListener ml = new MyActionListener(this);
	MyFrame1()
	{
		super("Election System");
		setLayout(null);
		setBounds(0,0,1600,1000);
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		b1 = new Button("Verify");
		b2 = new Button("CLEAR");
		b3 = new Button("NEXT");
		l1 = new Label("ELECTION SYSTEM");
		l2 = new Label("Name");
		l3 = new Label("Age");
		l4 = new Label("COUNTRY");
	
		l1.setBounds(100,100,400,100);
		l2.setBounds(100,300,400,100);
		l3.setBounds(100,550,400,100);
		l4.setBounds(100,550,400,100);
		t1.setBounds(500,50,400,100);
		t2.setBounds(500,300,400,100);
		t3.setBounds(500,550,400,100);
		b1.setBounds(600,700,200,100);
		b2.setBounds(600,700,200,100);
		b3.setBounds(600,700,200,100);
		Font f1 = new Font("Arial",Font.BOLD,30);
		
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		t1.setFont(f1);
		t2.setFont(f1);
		t3.setFont(f1);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);

		add(t1);
		add(t2);
		add(t3);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(b1);
		add(b2);
		add(b3);

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
			MyFrame1 mf = new MyFrame1();
			mf.setVisible(true);
	}
}