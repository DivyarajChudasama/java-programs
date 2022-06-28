import java.util.*;
import java.io.*;
class Student
{
	int age;
	String name;
	Student(int i,String n)
	{
		this.age=i;
		this.name=n;
	}
	public String toString()
	{
		return this.age+"$"+this.name;
	}
	public static void main(String args[]) throws IOException
	{
		FileWriter fw=new FileWriter("class.txt");
		Student s1=new Student(18,"Divyaraj");
		fw.write(s1.toString());
		fw.close();
		FileReader fr=new FileReader("class.txt");
		char ch[]=new char[100];
		fr.read(ch);
		fr.close();
		
		String record = new String(ch);
		String attr[] = record.split("$");

		Student	s2 = new Student(Integer.parseInt(attr[0]),attr[1]);

		System.out.println(s2);
	}

} 