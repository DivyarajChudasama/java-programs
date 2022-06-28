import java.util.Random;

class Square extends Thread
{
 int a;
 Square(int n)
 {
    a = n;
 }
 public void run()
 {
    int sqr = a * a;
    System.out.println("Square of " + a + " = " + sqr );
 }
}


class Cube extends Thread
{
 int a;
 Cube(int n)
 {
    a = n;
 }
 public void run()
 {
 int cub = a * a * a;
 System.out.println("Cube of " + a + " = " + cub );
 }
}


class Number extends Thread
{
 public void run()
 {
 Random random = new Random();
 for(int i =0; i<5; i++)
 {
 int randomInteger = random.nextInt(100);
 System.out.println("Random Integer generated : " + randomInteger);
 Square s = new Square(randomInteger);
 s.start();
 Cube c = new Cube(randomInteger);
 c.start();
 try {
 Thread.sleep(3000);
} catch (InterruptedException ea) {
 System.out.println(ea);

}

 }

 }

}

public class Main 
{
 public static void main(String args[])
 {
 Number n = new Number();
 n.start();
 }
}