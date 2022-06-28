package p1;
class Demo2{
	Demo2(){
	System.out.println("Within Same Package");
	//System.out.println("Private = "+pvt);
	//System.out.println("Default = "+def);
	//System.out.println("Protected = "+pro);
	System.out.println("Public = +pub");


	}
	public static  void main(String args[] ){
	new Demo2();
	}
}