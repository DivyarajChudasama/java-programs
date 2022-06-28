import java.io.File;
import java.io.IOException;

public class GFG{
	public static void main(String args[])
	{
	 try {
	 		File Obj = new File("myfile.txt");
	 		if(Obj.createNewFile()){
	 		 System.out.println("File created : "
	 		 					+Obj.getName());
	 		}
	 		else{
	 			System.out.println("File already exist..");
	 		}
	 }
	 catch(IOException e){
	 System.out.println("An errror has occured.");
	 e.printStackTrace();
	 }
	}
}