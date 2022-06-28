import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import javax.swing.JFrame;  

public class MyFrame6 extends Frame
{
    
    MyFrame6()
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
        Image i=t.getImage("WCONG.png");  
        g.drawImage(i, 0, 0,this);    
    }   

    public static void main(String[] args) 
     {
         MyFrame6 mf5= new MyFrame6(); 
         mf5.setExtendedState(mf5.getExtendedState() | JFrame.MAXIMIZED_BOTH);
         JFrame f=new JFrame(); 
         f.add(mf5);  
         f.setVisible(true);
     }
}

