import java.net.*;
import java.io.*;
import java.util.*;
class Client
{
 public static void main(String s[]) throws Exception
 {
 Socket ss=new Socket("10.80.14.33",5000);
 Socket s1=ss.accept();
 DataInputStream d1=new DataInputStream(ss.getInputStream());
 DataOutputStream d2= new DataOutputStream(s1.getOutputStream());
 String st;
 Scanner sc = new Scanner(System.in);
 while(true)
 {
    st =d1.readUTF();
    if(st.compareTo("STOP")==0)
    {
        break;
    }   
    System.out.println(st);
    st = sc.nextLine();
    d2.writeUTF(st);
    d2.flush();
    
    st =d1.readUTF();
    if(st.compareTo("STOP")==0)
    break;
    System.out.println(st);
 }
 
 d1.close();
 d2.close();
 } 
}