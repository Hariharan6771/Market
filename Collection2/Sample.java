package Collection2;

import java.util.HashMap;

public class Sample {
	public static void main(String[] args) {
		   HashMap<Integer,String>c=new HashMap<>();
		   c.put(786, "Hari");
		   c.put(787, "Bhuvi");
		   c.put(788, "Mani");
		   c.put(789, "kani");
		   
		   for(Integer k:c.keySet()) {
			System.out.println(k);
		   }
			System.out.println(" ");

		   for(String str:c.values()) {
			System.out.println(str);
		   }
			System.out.println(" ");

		   c.keySet().forEach(x->System.out.println(x));
			System.out.println(" ");

		   c.values().forEach(y->System.out.println(y));
			System.out.println(" ");
			c.keySet().forEach((x)->System.out.println(c.get(x)));
			System.out.println(" ");
			for(Integer k:c.keySet()) {
		    System.out.println(c.get(k));
			}


		   
			
		   }

}
