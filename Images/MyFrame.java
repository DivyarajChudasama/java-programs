import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import javax.swing.JFrame;  

public class MyFrame extends Frame
{
    JTextField t1,t2,t3,t4;
    JButton b1,b2;
    Font f1;
    MyActionListener ml = new MyActionListener(this);
    MyFrame()
    {
        setLayout(null);
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField(); 
        b1 = new JButton();
        b2 = new JButton();

        JButton b1 = new JButton("Clear");
        b1.setIcon(new ImageIcon(this.getClass().getResource("B1.png")));
        //b1.setBackground(Color. BLACK);
        b1.setBounds(630,590,350,130);
        add(b1);
        b1.addActionListener(ml);

        JButton b2 = new JButton("Verify");
        b2.setIcon(new ImageIcon(this.getClass().getResource("B2.png")));
        //b2.setBackground(Color. BLACK);
        b2.setBounds(1130,590,350,130);
        add(b2);

        b2.addActionListener(ml);



        t1 = new JTextField();
        t1.setBounds(590,326,400,70);
        add(t1);

        t1.addActionListener(ml);

        t2 = new JTextField();
        t2.setBounds(1110,326,400,70);
        add(t2);
        t2.addActionListener(ml);

         t3 = new JTextField();
        t3.setBounds(590,453,400,70);
        add(t3);
        t3.addActionListener(ml);


         t4 = new JTextField();
        t4.setBounds(1110,453,400,70);
        add(t4);
        t4.addActionListener(ml);

        Font f1 = new Font("Arial",Font.BOLD,30);
        t1.setFont(f1);
        t2.setFont(f1);
        t3.setFont(f1);
        t4.setFont(f1);

        addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent we)
                {
                     dispose();
                }
            });
    }
    public void paint(Graphics g) 
    {  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("2.png");  
        g.drawImage(i, 0, 0,this);    
    }   

    public static void main(String[] args) 
    {
        MyFrame mf = new MyFrame(); 
        mf.setExtendedState(mf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        JFrame f=new JFrame(); 
        f.add(mf);  
        f.setVisible(true);
    }
}

