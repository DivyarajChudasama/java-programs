import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import javax.swing.JFrame;  

public class MyFrame3 extends Frame
{
    Label l1,l2,l3,l4;
    Font f1;
    MyActionListener ml = new MyActionListener(this);
    MyFrame3()
    {
        setLayout(null);
        l1 = new Label();
        l2 = new Label();
        l3 = new Label();
        l4 = new Label();


        Label l1 = new Label("Narendra Modi is the Leader of BJP");
        l1.setBounds(21,490,376,295);
        add(l1);

        Label l2 = new Label("Rahul Gandhi is the Leader of Congress");
        l2.setBounds(411,490,376,295);
        add(l2);

        Label l3 = new Label("Arvind Kejriwal is the leader of AAP");
        l3.setBounds(800,490,376,295);
        add(l3);

        Label l4 = new Label("Sharad Pawar is the leader of NCP");
        l4.setBounds(1188,490,376,295);
        add(l4);


        addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent we)
                {
                    setVisible(false);
                }
            });
    }
    public void paint(Graphics g) 
    {  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("4.png");  
        g.drawImage(i, 0, 0,this);    
    }   

    public static void main(String[] args) 
    {
        MyFrame3 mf3 = new MyFrame3(); 
        mf3.setExtendedState(mf3.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        JFrame f3=new JFrame(); 
        f3.add(mf3);  
       f3.setVisible(true);
    }
}
