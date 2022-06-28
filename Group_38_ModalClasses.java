package Myproject;
import java.io.*;
import java.util.*;
class Authentication
{
	String name;
	int age;
	Bowler(String s,int i)
	{
		this.name=s;
		this.age=i;
	}
}
class Party
{
	String p_name;
	int l_name;
	Batsman(String a,int b)
	{
		this.p_name=a;
		this.l_name=b;
	}
}
class Voter
{

	String v_name;
	
	Captain(String c)
	{
		this.c_name=c;
	}
}

 class ElectionSystem
{

	ArrayList<Authentication> bo=new ArrayList<Authentication>();
	ArrayList< Party> ba=new ArrayList< Party>();
	ArrayList<Voter> ca=new ArrayList<Voter>();
	public static void main(String[]args) throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("data.txt"));
		
	}

}
