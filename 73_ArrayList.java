
import java.util.*;
class SortOnNo implements Comparator<Test>
{
	public int compare(Test t1, Test t2)
	{
		return t1.no - t2.no;
	}
}
class SortOnName implements Comparator<Test>
{
	public int compare(Test n1, Test n2)
	{
		return n1.name.compareTo(n2.name);
	}
}
class Test
{
	int no;
	String name;
	
	Test(int a, String b)
	{
		this.no = a;
		this.name = b;
	}
	public String toString()
	{
		return "No = "+this.no+" Name = "+this.name;
	}
	public static void main(String st[])
	{
		ArrayList <Test> al = new ArrayList<Test>();
		al.add(new Test(1,"Namra"));
		al.add(new Test(2,"Jatan"));
		al.add(new Test(3,"Divyaraj"));
		al.add(new Test(4,"Yenish"));
		al.add(new Test(5,"Shashank"));
		
		Iterator <Test> ir = al.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		//Remove Object
		System.out.println("After Removing : ");
		al.remove(2);
		
		ir = al.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		//Sorting on ArrayList
		System.out.println("After Sorting : ");
		Collections.sort(al, new SortOnNo());
		
		ir = al.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		ir = al.iterator();
		
		System.out.println("After Sorting by name :");
		Collections.sort(al, new SortOnName());
		
		ir = al.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		System.out.println("After Adding :");
		al.add(2,new Test(2,"Dhruv"));
		ir = al.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
	}
}