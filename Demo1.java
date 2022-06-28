package p1;
class Demo1{
	private int pvt = 10;
	int def = 20;
	protected int pro = 30;
	public int pub = 40;

	Demo1(){
	System.out.println("Within Same Class");
	System.out.println("Private = "+pvt);
	System.out.println("Default = "+def);
	System.out.println("Protected = "+pro);
	System.out.println("Public = +pub");


	}
	public static  void main(String args[] ){
	new Demo1();
	}
}