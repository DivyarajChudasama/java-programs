class T1
	{
		int n1;
		int n2;
		public void add(int i,int j)
			{
				System.out.println(i+j);
			}
		public void add(int i,int j,int k)
			{
				System.out.println(i+j+k);
			}
		T1()
			{
				 n1=5;
				 n2=10;
			}
		T1(int a,int b)
			{
				n1=a;
				n2=b;
			}
		void Display()
			{

				System.out.println(n1);
				System.out.print(n2);
			}
		public static void main(String[]args)
			{
				T1 t0=new T1();
				T1 t2=new T1(1,3);
				t2.Display();
				System.out.println("");
				t0.Display();
				System.out.println("");
				t0.add(1,9);
				t2.add(1,6,7);
			
			}			
		}
