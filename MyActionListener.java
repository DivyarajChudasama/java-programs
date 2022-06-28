
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;

public class MyActionListener implements ActionListener, ItemListener
{
	MyFrame mf;
	MyFrame1 mf1;
	MyFrame2 mf2;
	MyFrame4 mf4;
	
	
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
		MyActionListener(MyFrame4 m)
    {
		this.mf4 = m;
	}
	
	static String a1;
	static String a2;
	static String a3;
	static String a4;
	static String a5;

	public void itemStateChanged(ItemEvent e)
	{

		if(mf2.comboBox1.getSelectedItem().equals("Ahmedabad")) //&& mf2.comboBox3.getSelectedItem().equals("Surat")//
		{
			System.out.println("sfhfsdfhdfgdhd");  
			
		}

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("NEXT"))
        {
            mf1 = new MyFrame1();
            this.mf1.setVisible(true);	
			
        }

		if(e.getActionCommand().equals("NEXT1"))
        {
			//  mf1 = new MyFrame1();

            mf2 = new MyFrame2();
            this.mf2.setVisible(true);	

        }

		if(e.getActionCommand().equals("SAVE1"))
		{
			a1 = this.mf1.t1.getText();
			a2 = this.mf1.t2.getText();
			a3 = this.mf1.t3.getText();
			a4 = this.mf1.t4.getText();
			a5 = this.mf1.t5.getText();
			
			try
			{
				FileWriter fw = new FileWriter("data.txt");
				fw.write(a1);
				fw.write("\n");
				fw.write(a2);
				fw.write("\n");
				fw.write(a3);
				fw.write("\n");
				fw.write(a4);
				fw.write("\n");
				fw.write(a5);
							
				fw.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);

			}
		}

		if(e.getActionCommand().equals("NEXT2"))
        {
            mf4 = new MyFrame4();
            this.mf4.setVisible(true);	
        }

		if(e.getActionCommand().equals("PREVIOUS1"))
        {
            mf = new MyFrame();
            this.mf.setVisible(true);	
        }

		if(e.getActionCommand().equals("PREVIOUS2"))
        {
            mf1 = new MyFrame1();
            this.mf1.setVisible(true);	
        }

		if(e.getActionCommand().equals("PREVIOUS3"))
        {
            mf2 = new MyFrame2();
            this.mf2.setVisible(true);	
        }


        }



		

		



		
	}
