import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
public class MyActionListener implements ActionListener
{
	MyFrame mf;
	String s1="",s2="";
	int i;
	MyActionListener(MyFrame m)
	{
		this.mf=m;
	}
	public void actionPerformed(ActionEvent e)
	{
		int fact=1;
		s1= this.mf.t1.getText();
		i = Integer.parseInt(s1);
		for(int j=1;j<=i;j++)
		{
			fact=fact*j;
		}		
		this.mf.t2.setText(new Integer(fact).toString());
		System.out.println(fact);
	}
}