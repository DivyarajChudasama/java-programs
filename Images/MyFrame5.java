import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import javax.swing.JFrame;  

public class MyFrame5 extends Frame
{
    
    MyFrame5()
    {
        setLayout(null);
        
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
        Image i=t.getImage("WBJP.png");  
        g.drawImage(i, 0, 0,this);    
    }   

    public static void main(String[] args) 
     {
         MyFrame5 mf4= new MyFrame5(); 
         mf4.setExtendedState(mf4.getExtendedState() | JFrame.MAXIMIZED_BOTH);
         JFrame f=new JFrame(); 
         f.add(mf4);  
         f.setVisible(true);
     }
}

