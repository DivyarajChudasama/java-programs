import java.net.ServerSocket;
import java.util.ArrayList;
import java.net.Socket;
public class Main{
	public static void main(String args[]){
	ArrayList<ServerThread> threadList = nre ArrayList();
	try(ServerSocket serverSocket = new ServerSocket(5000)){
	Socket socket = serverSocket.accept();
	ServerThread serverThread = new ServerThread(socket, threadList);
	threadList.add(serverThread);
	serverThread.start();
	}catch(Exception ex){
	System.out.println("Error occured in main of server :" ex.getStackTrace());
	}
	}
}