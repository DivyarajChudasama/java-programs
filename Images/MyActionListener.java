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
	MyFrame3 mf3;
	MyFrame4 mf4;
	MyFrame5 mf5;

	int cot;

	String a1;
	String a2;
	String a3;
	String a4;
	String name,gender,country,s,s1,s2,s3,s4;
	String age;
	Boolean b1=false;

	
	MyActionListener(String a,String b,String c,String d)
	{
		this.name=a;
		this.gender=b;
		this.country=c;
		this.age=d;
	}
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

	MyActionListener(MyFrame3 m)
	{
		this.mf3 = m;
	}

	MyActionListener(MyFrame4 m)
	{
		this.mf4 = m;
	}
	MyActionListener(MyFrame5 m)
	{
		this.mf5 = m;
	}
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		MyFrame4 mf4 = new MyFrame4();
		
		if(e.getActionCommand().equals("Vote"))
		{
			MyFrame mf = new MyFrame();
			mf.setVisible(true);
			mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			mf1.setVisible(false);
			System.out.println("Vote");
		}
		if(e.getActionCommand().equals("Clear"))
		{
			System.out.println("Verify");
			// this.mf.dispose();
			MyFrame mf = new MyFrame();
			// mf.setVisible(true);
			this.mf.t1.setText("");
			this.mf.t2.setText("");
			this.mf.t3.setText("");
			this.mf.t4.setText("");
			
		}

		if(e.getActionCommand().equals("Verify"))
		{
			System.out.println("Verify");

			 	a1 = ((this.mf.t1.getText()).trim()).toLowerCase();

			  	a2 = ((this.mf.t2.getText()).trim()).toLowerCase();

 			 	a3 = ((this.mf.t3.getText()).trim()).toLowerCase();

			  	a4 = (this.mf.t4.getText()).trim();

			try
			{
				ArrayList <String> data = new ArrayList<>();
	
				 BufferedReader bufReader = new BufferedReader(new FileReader("DATA.txt"));
				String line = bufReader.readLine(); 
				while (line != null) 
				{ 
					data.add(line); line = bufReader.readLine(); 
				} 
				bufReader.close();
				for(int loop=0;loop<data.size();loop++)
				{
					String attr[] = data.get(loop).split("#");
					if(attr.length>1)
					{
						if(attr[0].trim().equals(a1) && attr[1].trim().equals(a2) && attr[2].trim().equals(a3) && attr[3].trim().equals(a4))
						{
							b1=true;
						}
						
						if(b1)
						{
							MyFrame2 mf2 = new MyFrame2();
							//JOptionPane.showMessageDialog(mf2, "Invalid Data Entry");
							mf2.setVisible(true);
							mf2.setExtendedState(mf2.getExtendedState() | JFrame.MAXIMIZED_BOTH);
							b1=false;
						}
					}
				}

			}
			catch(Exception ex)
			{
				System.out.println(ex);

			}

		}
		

		if(e.getActionCommand().equals("Information"))
		{
			MyFrame3 mf3 = new MyFrame3();
			mf3.setVisible(true);
			mf3.setExtendedState(mf3.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			System.out.println("INFO");
		}

		if(e.getActionCommand().equals("Next"))
		{
			MyFrame5 mf5 = new MyFrame5();
			mf5.setVisible(true);
			mf5.setExtendedState(mf5.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			System.out.println("Next");
		}

		if(e.getActionCommand().equals("Submit"))
		{
			MyFrame1 mf1 = new MyFrame1();
			mf1.setVisible(true);
			mf1.setExtendedState(mf1.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			mf2.setVisible(false);
			System.out.println("Submit");
		}


		if(e.getActionCommand().equals("Result"))
		{
			mf4.setExtendedState(mf4.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			mf4.setVisible(true);
			mf1.setVisible(false);
			System.out.println("Result");
		}

		if(e.getActionCommand().equals("BJP"))
		{
			try
			{
				
				char ch[] = new char[20];
				FileReader fr = new FileReader("BJP.txt");
				fr.read(ch);
				fr.close();
				s=String.valueOf(ch);
				int i=Integer.parseInt(s.trim());
				i++;
		        
				FileWriter fw=new FileWriter("BJP.txt");
				fw.write(String.valueOf(i));
				fw.close();
		        
		        fr.close();
			}
			catch(Exception e4)
			{
				System.out.println(e4);
			}
		}
		if(e.getActionCommand().equals("Congress"))
		{
			try
			{
				
				char ch[] = new char[20];
				FileReader fr = new FileReader("CONG.txt");
				fr.read(ch);
				fr.close();
				s=String.valueOf(ch);
				int i=Integer.parseInt(s.trim());
				i++;
		        
				FileWriter fw=new FileWriter("CONG.txt");
				fw.write(String.valueOf(i));
				fw.close();
		        
		        fr.close();
			}
			catch(Exception e4)
			{
				System.out.println(e4);
			}
		}
		if(e.getActionCommand().equals("AAP"))
		{
			try
			{
				
				char ch[] = new char[20];
				FileReader fr = new FileReader("AAP.txt");
				fr.read(ch);
				fr.close();
				s=String.valueOf(ch);
				int i=Integer.parseInt(s.trim());
				i++;
		        
				FileWriter fw=new FileWriter("AAP.txt");
				fw.write(String.valueOf(i));
				fw.close();
		        
		        fr.close();
			}
			catch(Exception e4)
			{
				System.out.println(e4);
			}
		}
		if(e.getActionCommand().equals("NCP"))
		{
			try
			{
				
				char ch[] = new char[20];
				FileReader fr = new FileReader("NCP.txt");
				fr.read(ch);
				fr.close();
				s=String.valueOf(ch);
				int i=Integer.parseInt(s.trim());
				i++;
		        
				FileWriter fw=new FileWriter("NCP.txt");
				fw.write(String.valueOf(i));
				fw.close();
		        
		        fr.close();
			}
			catch(Exception e4)
			{
				System.out.println(e4);
			}
		}

	}


}