import java.util.Scanner;
class MaxOutOfThree
{
    public static void main(String arg[])
    {
        int max,a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        a=sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        b=sc.nextInt();
    
        System.out.print("Enter 3rd Number: ");
        c=sc.nextInt();
        
        max=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("\nMaximum number is "+max);
    }
}