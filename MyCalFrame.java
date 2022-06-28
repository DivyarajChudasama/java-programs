import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyCalFrame extends Frame
{
	TextField Screen;
	Button b1,b0,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bMul,bDiv,bEql,bClr;
	
	CalActionListener ml = new CalActionListener(this);
	
	MyCalFrame()
	{
		super("Calculator");
		setLayout(null);
		setBounds(0,0,405,560);
		
		Screen = new TextField();
		
		
		b0= new Button("0");
		
		b1= new Button("1");
		b2= new Button("2");
		b3= new Button("3");
		b4= new Button("4");
		b5= new Button("5");
		b6= new Button("6");
		b7= new Button("7");
		b8= new Button("8");
		b9= new Button("9");
		
		bAdd=new Button("+");
		bSub=new Button("-");
		bMul=new Button("*");
		bDiv=new Button("/");
		bEql=new Button("=");
		bClr =new Button("C");
		
		Screen.setBounds(5,100,400,60);
		b0.setBounds(105,450,100,100);
		b1.setBounds(5,350,100,100);
		b2.setBounds(105,350,100,100);
		b3.setBounds(205,350,100,100);
		b4.setBounds(5,250,100,100);
		b5.setBounds(105,250,100,100);
		b6.setBounds(205,250,100,100);
		b7.setBounds(5,150,100,100);
		b8.setBounds(105,150,100,100);
		b9.setBounds(205,150,100,100);
		bAdd.setBounds(305,450,100,100);
		bSub.setBounds(305,350,100,100);
		bMul.setBounds(305,250,100,100);
		bDiv.setBounds(305,150,100,100);
		bEql.setBounds(205,450,100,100);
		bClr.setBounds(5,450,100,100);
		
		add(Screen);
		add(b0);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
		add(bAdd);add(bSub);add(bMul);add(bDiv);add(bEql);add(bClr);
		
		Font f1 = new Font("Arial",Font.BOLD,40);
		
		Screen.setFont(f1);
		b0.setFont(f1);b1.setFont(f1);b2.setFont(f1);b3.setFont(f1);b4.setFont(f1);b5.setFont(f1);b6.setFont(f1);b7.setFont(f1);b8.setFont(f1);b9.setFont(f1);
		bAdd.setFont(f1);bSub.setFont(f1);bMul.setFont(f1);bDiv.setFont(f1);bEql.setFont(f1);bClr.setFont(f1);
		
		b0.addActionListener(ml);
		b1.addActionListener(ml);
		b2.addActionListener(ml);
		b3.addActionListener(ml);
		b4.addActionListener(ml);
		b5.addActionListener(ml);
		b6.addActionListener(ml);
		b7.addActionListener(ml);
		b8.addActionListener(ml);
		b9.addActionListener(ml);
		bAdd.addActionListener(ml);
		bSub.addActionListener(ml);
		bMul.addActionListener(ml);
		bDiv.addActionListener(ml);
		bEql.addActionListener(ml);
		bClr.addActionListener(ml);
		
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});	
	}
	
	public static void main(String s[])
	{
		MyCalFrame mf = new MyCalFrame();
		mf.setVisible(true);
	}
}