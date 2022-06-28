class Time
{
	int minutes;
	int hours;
	Time()
	{
		minutes=11;
		hours=11;
	}
	Time(int h, int m)
	{
		minutes=m;
		hours=h;
	}
	void Display()
	{
		System.out.println(hours);
		System.out.println(":");
		System.out.println(minutes);

	}
	int converter() 
	{
		return(this.hours*60+this.minutes);
	}	
	void biggertime(Time s)
	{
		if(s.converter()<this.converter())			
		{
				System.out.println("The default time is bigger ");
		}
				else
					{
						System.out.println("Calling time is bigger");	
					}
	}
		public static void main(String p[])
		 {
			Time t = new Time();
			Time t1=new Time(11 ,60);
			System.out.println("Current time :"+t.converter()+"minutes");
			System.out.println("Calling Time :"+t1.converter()+"minutes");
			t.biggertime(t1);
			

		}
}
