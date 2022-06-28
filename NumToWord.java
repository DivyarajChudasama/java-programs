import java.util.Scanner;
class NumToWord
{
    public void chk(int n, String ch)
    {
        String one[]={""," one"," two"," three"," four"," five",
                    " six"," seven"," eight"," nine"," ten",
                    " eleven"," twelve"," thirteen"," fourteen",
                    " fifteen"," sixteen"," seventeen"," eighteen",
                    " nineteen"};
        
        String ten[]={"",""," twenty"," thirty"," forty"," fifty",
                    " sixty"," seventy"," eighty"," ninety"};
        
        if(n>19)
        {
            System.out.print(ten[n/10]+" "+one[n%10]);
        }
        else
        {
            System.out.print(one[n]);
        }
        if(n>0)
        {
            System.out.print(ch);
        }
    }
    public static void main(String arg[])
    {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value: ");
        n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("Enter numbers greater then 0");
        }
        else
        {
            NumToWord a=new NumToWord();
            a.chk((n/1000)%100," thousand");
            a.chk((n/100)%10," hundred");
            a.chk((n%100),"");
        }
    }
}