import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
    

public class Frame2 extends Frame
{
	MyActionListener ml;
 	public Button[] box=new Button[9];
	Font f1;
	Frame2()
	{	
		ml = new MyActionListener(this);
		this.setSize(500,500);
		setLayout(new GridLayout(3,3,1,1));
		
		f1 = new Font("Times",Font.BOLD,60);
		for(int loop=0;loop<9;loop++)	
		{
			box[loop]=new Button(" ");
			box[loop].setFont(f1);
			add(box[loop]);
			box[loop].addActionListener(ml);
		}
        addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				System.exit(0);
			}
		});
	}
	
	public static void main(String args[]) throws Exception
	{
		Frame2 mf = new Frame2();
		mf.setVisible(true);
	}
	
}