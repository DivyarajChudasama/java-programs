import java.util.*;
class Main implements Comparable<Main>
	{ 
		String name;
		float cpi;
		double marks; 
		Main(String s,float i,double d)
			{
				this.name=s;
				this.cpi=i;
				this.marks=d;
			}
		public String toString()
			{
				return this.name+"#"+this.cpi+"#"+this.marks;
			}
		
		 public int compareTo(Main a1)
			{	

				return new Double(this.marks-a1.marks).intValue();
			}
		public static void main(String[]args)
			{
				Main s[]=new Main[4];
				s[0]=new Main("Divyaraj",9.3f,300);
				s[1]=new Main("Jatan",9.7f,420);
				s[2]=new Main("Yenish",7f,220);
				s[3]=new Main("Parag",10f,500);
				Arrays.sort(s);
				for(int j=0;j<s.length;j++)
						{
							System.out.println(s[j]);
						}

			}
	}