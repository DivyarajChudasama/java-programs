import java.net.*;
import java.io.*;
class Client
{
 public static void main(String s[]) throws Exception
 {
 Socket ss=new Socket("10.80.2.68",5000);
 DataInputStream d1=new DataInputStream(ss.getInputStream());
 String st;

st = d1.readUTF();

FileWriter fw = new FileWriter(st);

st = d1.readUTF();
fw.write(st);
fw.close();

 d1.close();
 } 
}