// Abstract class
abstract class  JAVA{
  // Abstract method (does not have a body)
  public abstract void teacher();
  // Regular method
  public void sem2() {
    System.out.println("Kapil Sir");
  }
}

// Subclass (inherit from JAVA)
class ICT extends JAVA {
  public void teacher() {
    // The body of teacher() is provided here
    System.out.println("Kapil sir is best");
  }
}

class Main {
  public static void main(String[] args) {
    ICT myICT = new ICT(); // Create a ICT object
    myICT.teacher();
    myICT.sem2();
  }
}