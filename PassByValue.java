class PassByValue
{
    String name="java";
    void display(String name)
    {
        name="Java Programming";
    }
    public static void main(String arg[])
    {
        PassByValue p=new PassByValue();
        System.out.println("Before changes : "+p.name);
        p.display("C++");
        System.out.println("After changes : "+p.name);
    }
}

class PassByReference
{
    String name="Java";
    void display(PassByReference p)
    {
        name="Java Programming";
    }
    public static void main(String arg[])
    {
        PassByReference p=new PassByReference();
        System.out.println("Before changes : "+p.name);
        p.display(p);
        System.out.println("After changes : "+p.name);
    }
}

class ReturningValue
{
    int n1,n2;
    void getValue(int a,int b)
    {
        n1=a;
        n2=b;
    }
    int returnMax()
    {
        return n1>n2?n1:n2;
    }
    public static void main(String arg[])
    {
        ReturningValue R=new ReturningValue();
        R.getValue(12,44);
        System.out.println("Maximum is : "+R.returnMax());
    }
}