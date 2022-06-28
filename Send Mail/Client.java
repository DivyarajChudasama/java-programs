import java.net.*;
import java.io.*;
import java.util.*;
class Client
{
 public static void main(String s[]) throws Exception
 {
 Socket ss=new Socket("10.80.2.68",5000);
 DataInputStream d1=new DataInputStream(ss.getInputStream());
 DataOutputStream d2=new DataOutputStream(ss.getOutputStream());

 String st1;
 String st;

Scanner sc1 = new Scanner(System.in);
   
   st =d1.readUTF();

    System.out.println(st);


    st1 = sc1.nextLine();
    
    d2.writeUTF(st1);

// FileWriter fw = new FileWriter(st1);

//     st1 = d1.readUTF();
//     fw.write(st1);
//     fw.close();

 d1.close();
 } 
}