import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import javax.swing.JFrame;  

public class MyFrame8 extends Frame
{
    
    MyFrame8()
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
        Image i=t.getImage("WNCP.png");  
        g.drawImage(i, 0, 0,this);    
    }   

    public static void main(String[] args) 
     {
         MyFrame8 mf7= new MyFrame8(); 
         mf7.setExtendedState(mf7.getExtendedState() | JFrame.MAXIMIZED_BOTH);
         JFrame f=new JFrame(); 
         f.add(mf7);  
         f.setVisible(true);
     }
}

