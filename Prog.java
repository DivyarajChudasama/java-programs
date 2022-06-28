abstract class Student
{
	int rollno;
	float percentage;
	String name;

	 abstract void display();	
}

class Test extends Student
{
	void display()
	{
		System.out.println(rollno);
	System.out.println(name);
	System.out.println(percentage);
	}

}
	