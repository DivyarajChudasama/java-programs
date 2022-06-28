import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;

public class MyActionListener implements ActionListener
{
	MyFrame mf;
	MyFrame1 mf1;
	MyFrame2 mf2;
	
	
	MyActionListener(MyFrame m)
	{
		this.mf = m;
	}
	
	MyActionListener(MyFrame1 m)
	{
		this.mf1 = m;
	}

	MyActionListener(MyFrame2 m)
	{
		this.mf2 = m;
	}
	
		}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Vote"))
		{
			mf = new MyFrame();
			this.mf.setVisible(true);
			this.mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			this.mf1.setVisible(false);
			//System.out.println("");
		}
}