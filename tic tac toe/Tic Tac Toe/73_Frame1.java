import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Frame1 extends Frame
{
	Button btn_start,btn_clear,btn_save;
	TextField txt1,txt2;
	Label player1,player2,welcome;
	MenuBar mb1;
	Menu m1;
	MenuItem mi1,mi2,mi3;
	MyActionListener ml;
	Frame1()
	{
		super("Tic Tac Toe GAME");
		setLayout(null);
		setBounds(0,0,800,600);
		ml = new MyActionListener(this);			
		txt1 = new TextField("Player 1");
		txt2 = new TextField("Player 2");
		welcome = new Label("Welcome to the game");
		player1 = new Label("Enter player1 name (X):- ");
		player2 = new Label("Enter player2 name (O):- ");
		btn_save=new Button("Save");
		btn_start=new Button("Start");
		btn_clear=new Button("Clear");		
		mb1 = new MenuBar();
		m1 = new Menu("Option");
		mi1= new MenuItem("Save");
		mi2= new MenuItem("Start");
		mi3 = new MenuItem("Clear");		
		welcome.setBounds(120,50,650,75);		
     	txt1.setBounds(50,150,300,75);
		player1.setBounds(410,150,280,75);
		player1.setBackground(Color.orange);	
		player2.setBounds(50,250,300,75);
		player2.setBounds(410,250,280,75);
		player2.setBackground(Color.yellow);
		btn_save.setBounds(75,430,100,75);
		btn_start.setBounds(250,430,175,75);
		btn_clear.setBounds(500,430,100,75);	 
		Font f1 = new Font("Arial",Font.BOLD,26);
		welcome.setFont(f1);
		txt1.setFont(f1);
		player1.setFont(f1);
		txt2.setFont(f1);
		player2.setFont(f1);
		btn_save.setFont(f1);
		btn_start.setFont(f1);
		btn_clear.setFont(f1);		
		add(welcome);
		add(player1);
		add(txt1);
		add(player2);
		add(txt2);
		add(btn_save);
		add(btn_start);
		add(btn_clear);
		m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
		mb1.add(m1);
		setMenuBar(mb1);
		
		btn_start.setEnabled(false);
		mi2.setEnabled(false);
		
		btn_save.addActionListener(ml);
		btn_start.addActionListener(ml);
		btn_clear.addActionListener(ml);
		txt1.addActionListener(ml);
		txt2.addActionListener(ml);
		mi1.addActionListener(ml);
		mi2.addActionListener(ml);
		mi3.addActionListener(ml);
		
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
			Frame1 mf = new Frame1();
			mf.setVisible(true);
	}
}