class StaticMain
{
    static
    {
        System.out.println("Static Before Main Method");
    }
    
    public static void main(String arg[])
    {
        System.out.println("Main Method");
    }
    
    static
    {
        System.out.println("Static After Main Method");
    }
}