import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import javax.swing.JFrame;  

public class MyFrame1 extends Frame
{
    JButton b1,b2,b3;
    MyActionListener ml = new MyActionListener(this);
    MyFrame1()
    {
        setLayout(null);
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();

        JButton b1 = new JButton("Information");
        b1.setIcon(new ImageIcon(this.getClass().getResource("info.png")));
        //b1.setBackground(Color. BLACK);
        b1.setBounds(220,550,340,180);
        add(b1);
        b1.addActionListener(ml);


        JButton b2 = new JButton("Result");
        b2.setIcon(new ImageIcon(this.getClass().getResource("result.png")));
        //b2.setBackground(Color. RED);
        b2.setBounds(585,320,280,110);
        add(b2);
         b2.addActionListener(ml);

        JButton b3 = new JButton("Vote");
        b3.setIcon(new ImageIcon(this.getClass().getResource("vote.png")));
        //b3.setBackground(Color. GREEN);
        b3.setBounds(905,330,112,170);
        add(b3);

        b3.addActionListener(ml);

        addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent we)
                {
                    System.exit(0);
                }
            });
    }
    public void paint(Graphics g) 
    {  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("1.png");  
        g.drawImage(i, 0, 0,this);    
    }   

    public static void main(String[] args) 
    {
        MyFrame1 mf1 = new MyFrame1(); 
        mf1.setExtendedState(mf1.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        JFrame f2=new JFrame(); 
        f2.add(mf1);  
       f2.setVisible(true);
    }
}
