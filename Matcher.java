import java.util.regex.*;

class Test
{
	public static void main(String args[])
	{
		Pattern p = Pattern .compile("^MH[0-9] {1,2} [A-Z] {1,2} [1-9] [0-9]{0,3}");
		Matcher  m1= p.matcher("MH03AB1234");
		Matcher m2= p.matcher("MH03A1");
		Matcher m3= p.matcher("MH3A1");

		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
	}
}



if(e.getActionCommand());
		{
			
		
		}