import java.util.*;
class Main{
public static void main(String[] args) {
Collection<Object> c = new ArrayList<Object>();
c.add(73);
c.add("Divyaraj");
System.out.println(c);
System.out.println(c.size());
c.remove(073);
System.out.println(c);
System.out.println(c.size());
}
}