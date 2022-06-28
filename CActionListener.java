import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
 
public class CActionListener implements ActionListener
{
	CalculatorFrame cf;
	String no1 = "",no2 = "";
	char o;
	CActionListener(CalculatorFrame c)
	{
		this.cf = c;
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(this.cf.bt_clear))
		{
			this.cf.txtCal_Screen.setText("");
		}
		else if(e.getSource().equals(this.cf.bt_plus))
		{
			no1 = this.cf.txtCal_Screen.getText();
			this.cf.txtCal_Screen.setText("");
			o= 'a';
		}
		else if(e.getSource().equals(this.cf.bt_minus))
		{
			no1 = this.cf.txtCal_Screen.getText();
			this.cf.txtCal_Screen.setText("");
			o= 's';
		}
		else if(e.getSource().equals(this.cf.bt_mul))
		{
			no1 = this.cf.txtCal_Screen.getText();
			this.cf.txtCal_Screen.setText("");
			o= 'm';
		}
		else if(e.getSource().equals(this.cf.bt_divide))
		{
			no1 = this.cf.txtCal_Screen.getText();
			this.cf.txtCal_Screen.setText("");
			o= 'd';
		}
		else if(e.getSource().equals(this.cf.bt_ans))
		{
			no2 = this.cf.txtCal_Screen.getText();
			switch(o)
			{
				case 'a':
				{
					this.cf.txtCal_Screen.setText(new String(new Integer(Integer.parseInt(no1)+Integer.parseInt(no2)).toString()));
					break;
				}
				case 's':
				{
					this.cf.txtCal_Screen.setText(new String(new Integer(Integer.parseInt(no1)-Integer.parseInt(no2)).toString()));
					break;
				}
				case 'm':
				{
					this.cf.txtCal_Screen.setText(new String(new Integer(Integer.parseInt(no1)*Integer.parseInt(no2)).toString()));
					break;
				}
				case 'd':
				{
					this.cf.txtCal_Screen.setText(new String(new Float(Float.parseFloat(no1)/Float.parseFloat(no2)).toString()));
					break;
				}
			}
		}
		else
		{
			this.cf.txtCal_Screen.setText((this.cf.txtCal_Screen.getText()+e.getActionCommand()).toString());
		}
		
	}
}