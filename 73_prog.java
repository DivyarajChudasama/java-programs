import java.io.*;
class Main
{
	public static void main(String args[])throws Exception
	{
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String name="";
		while(!name.equals("Stop"));{
		 System.out.println("Enter data: ");    
      name=br.readLine();    
      System.out.println("data is: "+name);    

		}
		 br.close();    
    	r.close();    
	}
}