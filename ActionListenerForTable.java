import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import java.io.*;
public class ActionListenerForTable implements ActionListener
{
	Frame1 mf;
	ActionListenerForTable(Frame1 f)
	{
		this.mf=f;
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("Show"))
		{
			
			try   
			{
				char ch[] = new char[1500];
				FileReader fr = new FileReader("Table.txt");
				fr.read(ch);
				fr.close();
				
				String records = new String(ch);
				String record[] = records.split("\n");
				for(int loop=0;loop<record.length;loop++)
				{
					String attr[] = record[loop].split(",");
					for(int i=0;i<3;i++)
					{
						if(attr.length>1)
						{
							if(i==0)
							{
								this.mf.box[loop][0].setText(attr[0]);
								//this.mf.box[loop][0].setText("hii");
							}
							else if(i==1)
							{
								//arrdata[loop][i]=(attr[1]);
								//this.mf.panel.box[loop][1].setText("hii");
								this.mf.box[loop][1].setText(attr[1]);
							}
							else if(i==2)
							{
								//this.mf.panel.box[loop][2].setText("hii");
								this.mf.box[loop][2].setText(attr[2]);
							}
						}
					}
				}
				
			}   
			catch (IOException ioe)   
			{
				JOptionPane.showMessageDialog(null, ioe.toString(),"Exception" , JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
	}
}