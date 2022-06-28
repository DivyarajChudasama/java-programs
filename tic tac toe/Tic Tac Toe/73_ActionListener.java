import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ActionListener
{
	Frame1 mf;
	Frame2 mf2;	
	public String Name1,Name2,win,win2,wName,turn1,turn2;	
	int flag=0;
	MyActionListener(Frame1 m){
		this.mf = m;
	}
	MyActionListener(Frame2 m){
		this.mf2 = m;
	}
	MyActionListener(String x,String y)
	{
		this.Name1=x;
		this.Name2=y;
	}
	MyActionListener()
	{
		this.Name1="Player 1";
		this.Name2="Player 2";
	}
	public String toString()
	{
		return this.Name1+","+this.Name2;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getActionCommand().equals("Save"))
		{
			String x,y;
			x=this.mf.player1.getText();
			y=this.mf.player2.getText();
			try 
			{
				MyActionListener obj = new MyActionListener(x,y);
				FileWriter fw=new FileWriter("Tic_Tac_Toe.txt");
				fw.write(obj.toString());
				fw.close();
			} 
			catch(IOException ie) 
			{
				System.out.println(ie);
			}
			this.mf.mi2.setEnabled(true);
			this.mf.btn_start.setEnabled(true);
		}
		if(e.getActionCommand().equals("Start"))
		{
			mf2=new Frame2();
			this.mf.setVisible(false);
			this.mf2.setVisible(true);
		}
		if(e.getActionCommand().equals("Clear"))
		{
			String x=this.mf.player1.getText();
			String y=this.mf.player2.getText();
			boolean bu1,bu2;
			bu1=x.equals("Player 1");
			bu2=y.equals("Player 2");
			if(bu1 && bu2)
			{
				try 
				{
					FileWriter fw=new FileWriter("Tic_Tac_Toe.txt");
					fw.close();
				} 
				catch(IOException ie) 
				{
					System.out.println(ie);
				}
				Name1=" ";
				Name2=" ";
				this.mf.player1.setText("Player 1");
				this.mf.player2.setText("Player 2");
				this.mf.btn_start.setEnabled(false);
				this.mf.mi2.setEnabled(false);
			}
			else
			{
				Object[] possibleValues = { "Yes", "No"};
				Object selectedValue = JOptionPane.showInputDialog(null, "Do you want to remove entered name?", "alert",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
				String jOption = selectedValue.toString();
				boolean bu3=jOption.equals("Yes");
				if(bu3)
				{
					try 
					{
						FileWriter fw=new FileWriter("Tic_Tac_Toe.txt");
						fw.close();
					} 
					catch(IOException ie) 
					{
						System.out.println(ie);
					}
					Name1=" ";
					Name2=" ";
					this.mf.player1.setText("Player 1");
					this.mf.player2.setText("Player 2");
					this.mf.bst.setEnabled(false);
					this.mf.mi2.setEnabled(false);
				}
			}
		}
		if(e.getActionCommand().equals(" "))
		{
			try 
			{
				char ch[] = new char[20];
				FileReader fr = new FileReader("Tic_Tac_Toe.txt");
				fr.read(ch);
				fr.close();
				
				String records = new String(ch);
				String attr[] = records.split(",");
				turn1 = attr[0];
				turn2 = attr[1].trim();
			} 
			catch(IOException ie) 
			{
				System.out.println(ie);
			}
			
			if(flag%2==0)
			{
				System.out.println(turn2+"'s turn");
			}
			else if(flag%2!=0)
			{	
				System.out.println(turn1+"'s turn");
			}
			for(int loop=0;loop<9;loop++)
			{
				
				if(e.getSource()==this.mf2.box[loop])
				{
					if(this.mf2.box[loop].getLabel()==" ")
					{
						if(flag%2==0)
						{
							this.mf2.box[loop].setLabel("X");
							this.mf2.box[loop].setBackground(Color.blue);
							flag=1;
							check();
						}
						else if(flag%2!=0)
						{
							this.mf2.box[loop].setLabel("O");
							this.mf2.box[loop].setBackground(Color.red);
							flag=2;
							check();
						}
					}
				}
			}
		}
	}
	public void check() 
	{
		//check X win conditions
		if((this.mf2.box[0].getLabel()=="X") && (this.mf2.box[1].getLabel()=="X") &&(this.mf2.box[2].getLabel()=="X")) 
		{
			this.mf2.box[0].setBackground(Color.green);
			this.mf2.box[1].setBackground(Color.green);
			this.mf2.box[2].setBackground(Color.green);
			xWins();
		}
		if((this.mf2.box[3].getLabel()=="X") &&(this.mf2.box[4].getLabel()=="X") &&(this.mf2.box[5].getLabel()=="X")) 
		{
			this.mf2.box[3].setBackground(Color.green);
			this.mf2.box[4].setBackground(Color.green);
			this.mf2.box[5].setBackground(Color.green);
			xWins();
		}
		if((this.mf2.box[6].getLabel()=="X") &&(this.mf2.box[7].getLabel()=="X") &&(this.mf2.box[8].getLabel()=="X")) 
		{
			this.mf2.box[6].setBackground(Color.green);
			this.mf2.box[7].setBackground(Color.green);
			this.mf2.box[8].setBackground(Color.green);
			xWins();
		}
		if((this.mf2.box[0].getLabel()=="X") && (this.mf2.box[3].getLabel()=="X") && (this.mf2.box[6].getLabel()=="X")) 
		{
			this.mf2.box[0].setBackground(Color.green);
			this.mf2.box[3].setBackground(Color.green);
			this.mf2.box[6].setBackground(Color.green);
			xWins();
		}
		if((this.mf2.box[1].getLabel()=="X") && (this.mf2.box[4].getLabel()=="X") &&(this.mf2.box[7].getLabel()=="X")) 
		{
			this.mf2.box[1].setBackground(Color.green);
			this.mf2.box[4].setBackground(Color.green);
			this.mf2.box[7].setBackground(Color.green);
			xWins();
		}
		if((this.mf2.box[2].getLabel()=="X") &&(this.mf2.box[5].getLabel()=="X") &&(this.mf2.box[8].getLabel()=="X")) 
		{
			this.mf2.box[2].setBackground(Color.green);
			this.mf2.box[5].setBackground(Color.green);
			this.mf2.box[8].setBackground(Color.green);
			xWins();
		}
		if((this.mf2.box[0].getLabel()=="X") && (this.mf2.box[4].getLabel()=="X") && (this.mf2.box[8].getLabel()=="X")) 
		{
			this.mf2.box[0].setBackground(Color.green);
			this.mf2.box[4].setBackground(Color.green);
			this.mf2.box[8].setBackground(Color.green);
			xWins();
		}
		if((this.mf2.box[2].getLabel()=="X") &&(this.mf2.box[4].getLabel()=="X") &&(this.mf2.box[6].getLabel()=="X"))
		{
			this.mf2.box[2].setBackground(Color.green);
			this.mf2.box[4].setBackground(Color.green);
			this.mf2.box[6].setBackground(Color.green);
			xWins();
		}
		//check O win conditions
		if((this.mf2.box[0].getLabel()=="O") &&(this.mf2.box[1].getLabel()=="O") &&(this.mf2.box[2].getLabel()=="O")) 
		{
			this.mf2.box[0].setBackground(Color.green);
			this.mf2.box[1].setBackground(Color.green);
			this.mf2.box[2].setBackground(Color.green);
			oWins();
		}
		if((this.mf2.box[3].getLabel()=="O") &&(this.mf2.box[4].getLabel()=="O") &&(this.mf2.box[5].getLabel()=="O")) 
		{
			this.mf2.box[3].setBackground(Color.green);
			this.mf2.box[4].setBackground(Color.green);
			this.mf2.box[5].setBackground(Color.green);
			oWins();
		}
		if((this.mf2.box[6].getLabel()=="O") &&(this.mf2.box[7].getLabel()=="O") &&(this.mf2.box[8].getLabel()=="O")) 
		{
			this.mf2.box[6].setBackground(Color.green);
			this.mf2.box[7].setBackground(Color.green);
			this.mf2.box[8].setBackground(Color.green);
			oWins();
		}
		if((this.mf2.box[0].getLabel()=="O") &&(this.mf2.box[3].getLabel()=="O") &&(this.mf2.box[6].getLabel()=="O")) 
		{
			this.mf2.box[0].setBackground(Color.green);
			this.mf2.box[3].setBackground(Color.green);
			this.mf2.box[6].setBackground(Color.green);
			oWins();
		}
		if((this.mf2.box[1].getLabel()=="O") &&(this.mf2.box[4].getLabel()=="O") &&(this.mf2.box[7].getLabel()=="O")) 
		{
			this.mf2.box[1].setBackground(Color.green);
			this.mf2.box[4].setBackground(Color.green);
			this.mf2.box[7].setBackground(Color.green);
			oWins();
		}
		if((this.mf2.box[2].getLabel()=="O") &&(this.mf2.box[5].getLabel()=="O") &&(this.mf2.box[8].getLabel()=="O")) 
		{
			this.mf2.box[2].setBackground(Color.green);
			this.mf2.box[5].setBackground(Color.green);
			this.mf2.box[8].setBackground(Color.green);
			oWins();
		}
		if((this.mf2.box[0].getLabel()=="O") &&(this.mf2.box[4].getLabel()=="O") &&(this.mf2.box[8].getLabel()=="O")) 
		{
			this.mf2.box[0].setBackground(Color.green);
			this.mf2.box[4].setBackground(Color.green);
			this.mf2.box[8].setBackground(Color.green);
			oWins();
		}
		if((this.mf2.box[2].getLabel()=="O") &&(this.mf2.box[4].getLabel()=="O") &&(this.mf2.box[6].getLabel()=="O")) 
		{
			this.mf2.box[2].setBackground(Color.green);
			this.mf2.box[4].setBackground(Color.green);
			this.mf2.box[6].setBackground(Color.green);
			oWins();
		}
	}
	public void xWins() 
	{
		try 
		{
			char ch[] = new char[20];
			FileReader fr = new FileReader("Tic_Tac_Toe.txt");
			fr.read(ch);
			fr.close();
			
			String records = new String(ch);
			String attr[] = records.split(",");
			win = attr[0];
		} 
		catch(IOException ie) 
		{
			System.out.println(ie);
		}
		for(int i=0;i<9;i++) 
		{
			this.mf2.box[i].setEnabled(false);
		}
		JOptionPane.showMessageDialog(null,"Congratulations "+win+" Thank you for playing",JOptionPane.PLAIN_MESSAGE);
	}
	public void oWins() 
	{
		try 
		{
			char ch[] = new char[20];
			FileReader fr = new FileReader("Tic_Tac_Toe.txt");
			fr.read(ch);
			fr.close();
			
			String records = new String(ch);
			String attr[] = records.split(",");
			win2 = attr[1];
		} 
		catch(IOException ie) 
		{
			System.out.println(ie);
		}
		for(int i=0;i<9;i++) 
		{
			this.mf2.box[i].setEnabled(false);
		}
		JOptionPane.showMessageDialog(null,"Congratulations "+win2+" Thank you for playing",JOptionPane.PLAIN_MESSAGE);
	}
}