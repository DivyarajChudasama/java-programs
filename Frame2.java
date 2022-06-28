import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Frame2 extends Frame
{
	Button bst,bcle,bsave;
	TextField player1,player2;
	Label player1txt,player2txt,welcometxt;
	MenuBar mb1;
	Menu m1;
	MenuItem mi1,mi2,mi3;
	MyActionListener ml;
	Frame2()
	{
		super("Tic Tac Toe");
		setLayout(null);
		setBounds(0,0,800,600);
		ml = new MyActionListener(this);			
		player1 = new TextField("Player 1");
		player2 = new TextField("Player 2");
		welcometxt = new Label("Welcome to Tic Tac Toe");
		player1txt = new Label("Enter player1 name (X):- ");
		player2txt = new Label("Enter player2 name (O):- ");
		bsave=new Button("Save");
		bst=new Button("Start");
		bcle=new Button("Clear");	
		mb1 = new MenuBar();
		m1 = new Menu("Option");
		mi1= new MenuItem("Save");
		mi2= new MenuItem("Start");
		mi3 = new MenuItem("Clear");		
		welcometxt.setBounds(120,50,650,75);		
		player1txt.setBounds(50,150,300,75);
		player1.setBounds(410,150,280,75);
		player1.setBackground(Color.orange);
		
		player2txt.setBounds(50,250,300,75);
		player2.setBounds(410,250,280,75);
		player2.setBackground(Color.yellow);
		bsave.setBounds(75,430,100,75);
		bst.setBounds(250,430,175,75);
		bcle.setBounds(500,430,100,75);		 
		Font f1 = new Font("Arial",Font.BOLD,26);
		welcometxt.setFont(f1);
		player1.setFont(f1);
		player1txt.setFont(f1);
		player2.setFont(f1);
		player2txt.setFont(f1);
		bsave.setFont(f1);
		bst.setFont(f1);
		bcle.setFont(f1);		
		add(welcometxt);
		add(player1);
		add(player1txt);
		add(player2);
		add(player2txt);
		add(bsave);
		add(bst);
		add(bcle);
		m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
		mb1.add(m1);
		setMenuBar(mb1);		
		bst.setEnabled(false);
		mi2.setEnabled(false);		
		bsave.addActionListener(ml);
		bst.addActionListener(ml);
		bcle.addActionListener(ml);
		player1.addActionListener(ml);
		player2.addActionListener(ml);
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
			Frame2 mf = new Frame2();
			mf.setVisible(true);
	}
}