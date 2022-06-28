class WrapperClass
{
    public static void main(String arg[])
    {
        Boolean bool=new Boolean("true");
        Byte b=new Byte("1");
        Short s=new Short(b);
        Character c=new Character('c');
        Integer i=new Integer(c);
        Long l=new Long(i);
        Float f=new Float(l);
        Double d=new Double(f);
        
        System.out.println(""+bool+b+s+c+i+l+f+d);
    }
}
