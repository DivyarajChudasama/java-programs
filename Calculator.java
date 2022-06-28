import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;
class Calculator extends JFrame {
    JLabel l1;
    Calculator(){
        setdefaultcloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        li = new JLabel("Calculator");
        l1.setFont(new Font("Times New Roman",Font.Italic,30));
        
        li.setBounds(60,10,300,30);
        add(li);
    }
}
class Calulator{
    public static void main(String s[]){
        Calculator c = new Calulator();
        c.setBounds(400,200,400,250);
        c.setvisible(true);
    }
}