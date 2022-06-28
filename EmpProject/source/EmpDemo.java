package au.mca;

class Employee{
	int empcode;
	string ename;
	int sal;

	Employee(int empcode, String ename, int sal){
		this.empcode = empcode;
		this.ename = ename;
		this.sal = sal;
	}

	Employee(){
		System.out.println("Employee Constructor");
	}
	public String toString(){
		return empcode+" "+ename+" "+sal;
	}
}

class EmployeeDemo{
	public static void  main(String args[])
	Employee e1 = new Employee(1001,"JATAN",2500);
	System.out.println(e1);
}