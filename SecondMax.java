import java.util.Scanner;
class SecondMax
{
    public static void main(String arg[])
    {
        int max=0,secondMax=0,temp,numbers;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        numbers=sc.nextInt();
        System.out.println("Enter Numbers");
        for(int i=0; i<numbers;i++)
        {
            if(i==0)
            {
                max=sc.nextInt();
            }
            else
            {
                temp=sc.nextInt();
                if(temp>max)
                {
                    secondMax=max;
                    max=temp;
                }
                else if(temp>secondMax)
                {
                    secondMax=temp;
                }
          }
        }
        System.out.println("Second Maximum number is "+secondMax);
    }
}    