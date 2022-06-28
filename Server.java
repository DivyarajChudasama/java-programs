import java.net.*;
import java.io.*;
import java.util.*;
class Server
{
 public static void main(String s[]) throws Exception
 {
 ServerSocket ss=new ServerSocket(5000);
 Socket s1=ss.accept();
 DataOutputStream d1=new DataOutputStream(s1.getOutputStream());
 DataInputStream d2=new DataInputStream(ss.getInputStream());
 String st,st1;
 String=
 char ch[]= new char(100);
 FileReader fr = new FileReader(s[0]);
 	d1.writeUTF(st);	
 }
 d1.close();
 d2.close
 } 
