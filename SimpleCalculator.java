import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;
class Calculator extends JFrame {
    JLabel l1;
    JTextField txt1,txt2;
    JButton btn1,btn2,btn3,btn4,btn5;
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

        txt1.setBounds(100,60,120,30);
        txt2.setBounds(100,100,20,30);
        
        btn1.setBounds(100,140,60,30);
        btn2.setBounds(170,140,60,30);
        btn3.setBounds(100,170,60,30);
        btn4.setBounds(170,170,60,30);
        btn5.setBounds(250,80,100,30);
        


        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(txt1);
        add(txt2);

        btn1.addActionListner(new ActionListner(){
            public void actionPerformed(ActionEvent ae){
                int no1 = Integer.parseInt(txt1.getText());
                 int no2 = Integer.parseInt(txt2.getText());
                 btn5.setButton("no1+no2");

            }
        });

        btn2.addActionListner(new ActionListner(){
            public void actionPerformed(ActionEvent ae){
                int no1 = Integer.parseInt(txt1.getText());
                 int no2 = Integer.parseInt(txt2.getText());
                 btn5.setButton("no1-no2");

            }
        });

        btn3.addActionListner(new ActionListner(){
            public void actionPerformed(ActionEvent ae){
                int no1 = Integer.parseInt(txt1.getText());
                 int no2 = Integer.parseInt(txt2.getText());
                 btn5.setButton("no1*no2");

            }
        });

        btn4.addActionListner(new ActionListner(){
            public void actionPerformed(ActionEvent ae){
                int no1 = Integer.parseInt(txt1.getText());
                 int no2 = Integer.parseInt(txt2.getText());
                 btn5.setButton("no1/no2");

            }
        });

    }
}
class MyCalulator{
    public static void main(String args[]){
        Calculator c = new Calculator();
        c.setBounds(400,200,400,400);
        c.setVisible(true);
    }
}