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
    
     String st;

     System.out.println("Text1.txt\nText2.txt\nText3.txt\nText4.txt\nText5.txt\n");

     Scanner sc = new Scanner(System.in);
    
     while(true)
     {
    	st = sc.nextLine();
    	if(st.compareTo("STOP")==0)
    	{
    		break;
    	}
    	d1.writeUTF(st);
        d1.flush();

     }
    
     d1.close();
    
    } 
}