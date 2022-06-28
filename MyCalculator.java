import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;
class Calculator extends JFrame {
    JLabel l1;
    JTextField txt1,txt2;
    JButton btn1,btn2,btn3,btn4;
    Calculator(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        l1 = new JLabel("Calculator");
        l1.setFont(new Font("Times New Roman",Font.BOLD,30));
        l1.setBounds(60,10,300,30);
        add(l1);

        txt1 = new JTextField(60);
        txt2 = new JTextField(60);
        btn1= new JButton("Add");
        btn2= new JButton("Sub");
        btn3= new JButton("Mul");
        btn4= new JButton("Div");

        txt1.setBound(100,60,120,30);
        txt2.setBound(100,100,20,30);


        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(txt1);
        add(txt2);

    }
}
class SimpleCalulator{
    public static void main(String args[]){
        Calculator c = new Calculator();
        c.setBounds(400,200,400,250);
        c.setVisible(true);
    }
}