import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;  

public class MyFrame4 extends Frame
{
    JTextPane l1,l2,l3,l4;
    ImageIcon p1,p2,p3,p4;
    JButton b1;
	JPanel img1,img2,img3,img4;
	JLabel imglabel;
    String path,temp;

   
    //Font f1;
    MyActionListener ml;
    MyFrame4()
    {
        setLayout(null);
        ml = new MyActionListener(this);

        

        JButton b1 = new JButton("Next");
        b1.setIcon(new ImageIcon(this.getClass().getResource("next .png")));
        b1.setBounds(1400,2,140,107);
        add(b1);
        b1.addActionListener(ml);

        
        
        temp=imgpath("BJP.txt");
        
        l1 = new JTextPane();
        Icon i1= new ImageIcon(temp);
        l1.insertIcon(i1);
		l1.setBounds(648,202,630,74);//img1
		

        temp=imgpath("AAP.txt");
        l2 = new JTextPane();
        Icon i2= new ImageIcon(temp);
        l2.insertIcon(i2);
		
		l2.setBounds(648,340,630,74);
		
		
        temp=imgpath("CONG.txt");
        l3 = new JTextPane();
        Icon i3= new ImageIcon(temp);
        l3.insertIcon(i3);
		
		l3.setBounds(648,484,630,74);

        //l4 = new JLabel();
        temp=imgpath("NCP.txt");
        l4 = new JTextPane();
        Icon i4= new ImageIcon(temp);
        l4.insertIcon(i4);
		
		
		l4.setBounds(648,631,630,74);
		add(l1);
        add(l2);
        add(l3);
        add(l4);


        //l11.addActionListener(ml);
        //l3 = new JLabel();
        /*l1.setBounds(648,202,630,74);
        l2.setBounds(648,340,630,74);
        l3.setBounds(648,484,630,74);
        l4.setBounds(648,631,630,74);*/
        /*add(img1);
        add(img2);
        add(img3);
        add(img4);*/
        //add(background);
        
     //   l24.addActionListener(ml);

        addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent we)
                {
                   setVisible(false);
                    // System.exit(0);
                }
            });
    }
    public void paint(Graphics g) 
    {  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("graph.png");//"graph.png");  
        g.drawImage(i, 0, 0,this);    
    }
    public String imgpath(String txtname)
    {
        try 
        {
            char ch[] = new char[20];
            FileReader fr = new FileReader(txtname);
            fr.read(ch);
            fr.close();
            String s=String.valueOf(ch);
            int r = Integer.parseInt(s.trim());
            path= r+"vote.png";
            //System.out.println(path);
        }
        catch(Exception iv)
        {

        }
        return path;
    }

    public static void main(String[] args) 
    {
        MyFrame4 mf4 = new MyFrame4(); 
        mf4.setExtendedState(mf4.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        JFrame f4=new JFrame(); 
        f4.add(mf4);  
        f4.setVisible(true);
    }
}

