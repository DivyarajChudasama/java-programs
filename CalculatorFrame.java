 import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class CalculatorFrame extends Frame
{
	TextField txtCal_Screen;
	Button btnCal_0,btnCal_1,btnCal_2,btnCal_3,btnCal_4,btnCal_5,btnCal_6,btnCal_7,btnCal_8,btnCal_9;
	Button bt_plus,bt_minus,bt_mul,bt_divide,bt_clear,bt_ans;
	
	CActionListener  m1 = new CActionListener(this);
	 CalculatorFrame()
	{
		super("Calculator");
		setLayout(null);
		setBounds(200,200,400,540);
		
		txtCal_Screen = new TextField();
		txtCal_Screen.setBounds(20,30,360,100);
		btnCal_0 = new Button("0");
		btnCal_1 = new Button("1");
		btnCal_2 = new Button("2");
		btnCal_3 = new Button("3");
		btnCal_4 = new Button("4");
		btnCal_5 = new Button("5");
		btnCal_6 = new Button("6");
		btnCal_7 = new Button("7");
		btnCal_8 = new Button("8");
		btnCal_9 = new Button("9");
		bt_plus = new Button("+");
		bt_minus = new Button("-");
		bt_mul= new Button("*");
		bt_divide= new Button("/");
		bt_clear = new Button("CE");
		bt_ans = new Button("=");
		
		add(txtCal_Screen);
		add(btnCal_0);
		add(btnCal_1);
		add(btnCal_2);
		add(btnCal_3);
		add(btnCal_4);
		add(btnCal_5);
		add(btnCal_6);
		add(btnCal_7);
		add(btnCal_8);
		add(btnCal_9);
		add(bt_plus);
		add(bt_minus);
		add(bt_mul);
		add(bt_divide);
		add(bt_clear);
		add(bt_ans);
		
		btnCal_0.setBounds(0,440,100,100);
		btnCal_1.setBounds(0,140,100,100);
		btnCal_2.setBounds(100,140,100,100);
		btnCal_3.setBounds(200,140,100,100);
		btnCal_4.setBounds(0,240,100,100);
		btnCal_5.setBounds(100,240,100,100);
		btnCal_6.setBounds(200,240,100,100);
		btnCal_7.setBounds(0,340,100,100);
		btnCal_8.setBounds(100,340,100,100);
		btnCal_9.setBounds(200,340,100,100);
		bt_plus.setBounds(200,440,100,100);
		bt_minus.setBounds(300,440,100,100);
		bt_mul.setBounds(300,340,100,100);
		bt_divide.setBounds(300,240,100,100);
		bt_clear.setBounds(300,140,100,100);
		bt_ans.setBounds(100,440,100,100);
		
		
		txtCal_Screen.addActionListener(m1);
		btnCal_0.addActionListener(m1);
		btnCal_1.addActionListener(m1);
		btnCal_2.addActionListener(m1);
		btnCal_3.addActionListener(m1);
		btnCal_4.addActionListener(m1);
		btnCal_5.addActionListener(m1);
		btnCal_6.addActionListener(m1);
		btnCal_7.addActionListener(m1);
		btnCal_8.addActionListener(m1);
		btnCal_9.addActionListener(m1);
		bt_plus.addActionListener(m1);
		bt_minus.addActionListener(m1);
		bt_mul.addActionListener(m1);
		bt_divide.addActionListener(m1);
		bt_clear.addActionListener(m1);
		bt_ans.addActionListener(m1);
		
		Font f1 = new Font ("Arial",Font.BOLD,35);
		txtCal_Screen.setFont(f1);
		btnCal_0.setFont(f1);
		btnCal_1.setFont(f1);
		btnCal_2.setFont(f1);
		btnCal_3.setFont(f1);
		btnCal_4.setFont(f1);
		btnCal_5.setFont(f1);
		btnCal_6.setFont(f1);
		btnCal_7.setFont(f1);
		btnCal_8.setFont(f1);
		btnCal_9.setFont(f1);
		bt_plus.setFont(f1);
		bt_minus.setFont(f1);
		bt_mul.setFont(f1);
		bt_divide.setFont(f1);
		bt_clear.setFont(f1);
		bt_ans.setFont(f1);
		
			addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
		
	}
	public static void main(String args[])
	{
			 CalculatorFrame cf = new  CalculatorFrame();
			cf.setVisible(true);
	}
	
}   