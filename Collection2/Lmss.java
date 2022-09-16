package Collection2;

import java.util.HashMap;

public class Lmss {
	public static void main(String[] args) {
   HashMap<Integer,String>c=new HashMap<>();
   c.put(786, "Hari");
   c.put(787, "Bhuvi");
   c.put(788, "Mani");
   c.put(789, "kani");
   System.out.println(c);
   System.out.println(c.keySet());
   System.out.println(c.values());
   System.out.println(c.get(786));
   c.remove(787);
   System.out.println(c.get(787));
   System.out.println(c.remove(788,"Mani"));
   System.out.println(c.remove(786,"Mani"));
  
   }
   
   
   
	

}
