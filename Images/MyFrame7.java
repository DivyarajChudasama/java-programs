import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import javax.swing.JFrame;  

public class MyFrame7 extends Frame
{
    
    MyFrame7()
    {
        setLayout(null);
        
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
        Image i=t.getImage("WAAP.png");  
        g.drawImage(i, 0, 0,this);    
    }   

    public static void main(String[] args) 
     {
         MyFrame7 mf6= new MyFrame7(); 
         mf6.setExtendedState(mf6.getExtendedState() | JFrame.MAXIMIZED_BOTH);
         JFrame f=new JFrame(); 
         f.add(mf6);  
         f.setVisible(true);
     }
}

