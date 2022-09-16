package Collections1;

import java.util.ArrayList;

public class FruitsStrin {
	public static void main(String[] args) {
	ArrayList<String> f=new ArrayList<>();
	f.add("Banana");
	f.add("Grapes");
	f.add("Apple");
	f.add("Mango");
	System.out.println(f);
	
	f.remove(2);
	System.out.println(f);
	
	f.set(2,"Orange");
	System.out.println(f);
	
	f.get(1);
	System.out.println(f.get(1));
	System.out.println(f.size());

	 }

}
 