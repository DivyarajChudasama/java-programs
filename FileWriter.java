import java.io.FileWriter;
import java.io.IOException;

public class GG{
	public static void main(String args[])
	{
	 try{
	 	FileWriter w = new FileWiter("file.txt");
	 	w.write("File in java are seriously good !!");
	 	w.close();
	 	System.out.println("Succesfully written");
	 }
	 catch(IOException e){
	 	System.out.println("An error has occured");
	 	e.printStackTrace();
	 }
	}
}