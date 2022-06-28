import java.util.*;
class Employee
	{
		public static void main(String[]args)
			{
				int emp_id;
				Scanner s=new Scanner(System.in);
				System.out.println("Enter employee id ");
				emp_id=s.nextInt();
				s.nextLine();
				String emp_name=new String();
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter employee name ");
				emp_name=s.nextLine();
				System.out.println("Employee id:"+emp_id);
				System.out.println("Employee name :"+emp_name);
				
			}

	}