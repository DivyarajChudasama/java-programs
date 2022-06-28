import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;

class CalActionListener implements ActionListener
{
	MyCalFrame fm;
	String no1="",no2="";
	char o;
	CalActionListener(MyCalFrame m)
	{
		this.fm=m;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(this.fm.bClr))
		{
			this.fm.Screen.setText("");
		}
		else if(e.getSource().equals(this.fm.bAdd))
		{
			no1=this.fm.Screen.getText();
			this.fm.Screen.setText("");
			o='a';
		}
		else if(e.getSource().equals(this.fm.bSub))
		{
			no1=this.fm.Screen.getText();
			this.fm.Screen.setText("");
			o='s';
		}
		else if(e.getSource().equals(this.fm.bMul))
		{
			no1=this.fm.Screen.getText();
			this.fm.Screen.setText("");
			o='m';
		}
		else if(e.getSource().equals(this.fm.bDiv))
		{
			no1=this.fm.Screen.getText();
			this.fm.Screen.setText("");
			o='d';
		}
		else if(e.getSource().equals(this.fm.bEql))
		{
			no2=this.fm.Screen.getText();
			switch(o)
			{
				case 'a':{
					this.fm.Screen.setText(new String(new Integer(Integer.parseInt(no1)+Integer.parseInt(no2)).toString()));
					break;
				}
				case 's':{
					this.fm.Screen.setText(new String(new Integer(Integer.parseInt(no1)-Integer.parseInt(no2)).toString()));
					break;
				}
				case 'm':{
					this.fm.Screen.setText(new String(new Integer(Integer.parseInt(no1)*Integer.parseInt(no2)).toString()));
					break;
				}
				case 'd':{
					this.fm.Screen.setText(new String(new Float(Float.parseFloat(no1)/Float.parseFloat(no2)).toString()));
					break;
				}
			}
		}
		else
		{
			this.fm.Screen.setText((this.fm.Screen.getText()+e.getActionCommand()).toString());
		}
		
	}
}