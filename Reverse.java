import java.util.Scanner;
class ReverseNumber
{
    public static void main(String arg[])
    {
        int n, rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number to Reverse: ");
        n=sc.nextInt();
        
        while(n!=0)
        {
            rev=rev*10;
            rev=rev+n%10;
            n=n/10;
        }
        System.out.print("Reverse: "+rev);
    }
}