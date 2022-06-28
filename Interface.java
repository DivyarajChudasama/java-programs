interface  ECE{
   void electronics();
}
interface  ICT{
   void communication();
}
class Marwadi implements ECE, ICT {
   public void electronics() {
      System.out.println("Marwadi used to have Electronics Communication Engineering");
   }
   public void communication() {
      System.out.println("Marwadi now have Information Communication and Technology Engineering");
   }
}
public class Interface {
   public static void main(String args[]) {
      Marwadi a = new Marwadi();
      a.electronics();
      a.communication();
   }
}