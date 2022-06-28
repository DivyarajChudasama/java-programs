//Traffic lights by Vedant
import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.lang.*;
import javax.swing.*;
public class TrafficFrame extends JFrame
{
	//Component
	
	JFrame f;
	
	JRadioButton btRed,btYellow,btGreen;
	
	JLabel welcomeTxt,messagetxt;
	
	JTextField messageBox,redBox,yellowBox,greenBox;
	
	JButton clear;

	TrafficActionListener ml = new TrafficActionListener(this);
	
	TrafficFrame()
	{
		
		f=new JFrame("Traffic lights by Vedant");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Initialized Components
		
		
		welcomeTxt = new JLabel("Welcome to Traffic lights program");
		messagetxt = new JLabel("Message Box");
		btRed = new JRadioButton("Red light");
		btYellow = new JRadioButton("Yellow light");
		btGreen = new JRadioButton("Green light");
		messageBox = new JTextField(" ");
		redBox = new JTextField(" ");
		yellowBox = new JTextField(" ");
		greenBox = new JTextField(" ");
		clear = new JButton("CLEAR");
		
		//Set Component
		welcomeTxt.setBounds(50,10,400,100);
		
		redBox.setBounds(50,130,125,30);
		yellowBox.setBounds(190,130,125,30);
		greenBox.setBounds(330,130,125,30);
		
		btRed.setBounds(50,180,125,50);
		btYellow.setBounds(190,180,125,50);
		btGreen.setBounds(330,180,125,50);
		
		messagetxt.setBounds(50,250,200,50);
		messageBox.setBounds(50,310,400,50);
		
		clear.setBounds(150,380,200,50);
		
		Font f1 = new Font("Arial",Font.BOLD,25);
		Font f2 = new Font("Arial",Font.ITALIC,12);
		Font f3 = new Font("Arial",Font.BOLD,18);
		//SetFont
		welcomeTxt.setFont(f1);
		clear.setFont(f3);
		messagetxt.setFont(f3);
		messageBox.setFont(f2);
		btRed.setFont(f2);
		btYellow.setFont(f2);
		btGreen.setFont(f2);
		redBox.setFont(f3);yellowBox.setFont(f3);greenBox.setFont(f3);
		
		f.add(welcomeTxt);
		f.add(redBox);
		f.add(yellowBox);
		f.add(greenBox);
		f.add(btRed);
		f.add(btYellow);
		f.add(btGreen);
		f.add(messageBox);
		f.add(messagetxt);
		f.add(clear);
		
		this.btRed.addActionListener(ml);
		this.btYellow.addActionListener(ml);
		this.btGreen.addActionListener(ml);
		this.messageBox.addActionListener(ml);
		this.clear.addActionListener(ml);
		this.redBox.addActionListener(ml);
		this.yellowBox.addActionListener(ml);
		this.greenBox.addActionListener(ml);
		
		f.setLayout(null);
		f.setSize(510,500);
		f.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new TrafficFrame();
		
	}
}