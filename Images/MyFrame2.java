import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import javax.swing.JFrame;  

public class MyFrame2 extends Frame
{
    JButton b1,b2,b3,b4,b5;
    MyActionListener ml = new MyActionListener(this);
    MyFrame2()
    {
        setLayout(null);
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();

        JButton b1 = new JButton("BJP");
        b1.setIcon(new ImageIcon(this.getClass().getResource("Bu1.png")));
        b1.setBackground(Color. BLACK);
        b1.setBounds(19,508,378,115);
        add(b1);

        JButton b2 = new JButton("Congress");
        b2.setIcon(new ImageIcon(this.getClass().getResource("Bu2.png")));
        //b2.setBackground(Color. RED);
        b2.setBounds(415,508,380,110);
        add(b2);

        JButton b3 = new JButton("AAP");
        b3.setIcon(new ImageIcon(this.getClass().getResource("Bu3.png")));
        b3.setBackground(Color. GREEN);
        b3.setBounds(790,508,380,110);
        add(b3);

        JButton b4 = new JButton("NCP");
        b4.setIcon(new ImageIcon(this.getClass().getResource("Bu4.png")));
        b4.setBackground(Color. RED);
        b4.setBounds(1200,500,380,130);
        add(b4);

        JButton b5 = new JButton("Submit");
        b5.setIcon(new ImageIcon(this.getClass().getResource("Bu5.png")));
        b5.setBackground(Color. RED);
        b5.setBounds(602,650,380,110);
        add(b5);
        b5.addActionListener(ml);

        addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent we)
                {
                    setVisible(false);
                    //dispose();
                }
            });
    }
    public void paint(Graphics g) 
    {  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("3.png");  
        g.drawImage(i, 0, 0,this);    
    }   

    public static void main(String[] args) 
     {
         MyFrame2 mf2= new MyFrame2(); 
         mf2.setExtendedState(mf2.getExtendedState() | JFrame.MAXIMIZED_BOTH);
         JFrame f=new JFrame(); 
         f.add(mf2);  
         f.setVisible(true);
     }
}

