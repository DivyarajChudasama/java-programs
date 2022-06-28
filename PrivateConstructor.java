class PrivateConstDemo
{
    int a,b;
    static int count;
    private PrivateConstDemo()    
    {
        
        count++;
        System.out.println("I'm Default Constructor "+count);
    }
    private PrivateConstDemo(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    int getNumFirst()
    {
        return a;
    }
    int getNumSecond()
    {
        return b;
    }
    
    public static void main(String arg[])
    {
        
    
        PrivateConstDemo p1=new PrivateConstDemo();
        PrivateConstDemo p2=new PrivateConstDemo();
        PrivateConstDemo p3=new PrivateConstDemo();
        PrivateConstDemo p4=new PrivateConstDemo();
        System.out.println("Instances of Default Constructor : "+count);
        
        PrivateConstDemo p5=new PrivateConstDemo(count,5);
        int x=p5.getNumFirst();
        int y=p5.getNumSecond();
        int minOutOfTwo=x<y?x:y;
        System.out.println("Minimum of "+x+" and "+y+" is "+minOutOfTwo);
    }
}