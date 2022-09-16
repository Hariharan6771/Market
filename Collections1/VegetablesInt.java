package Collections1;

import java.util.ArrayList;

public class VegetablesInt {
	public static void main(String[] args) {
	ArrayList<Integer>v=new ArrayList<>();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	System.out.println(v);
	
	v.remove(2);
	System.out.println(v);
	
	v.set(2, 50);
	System.out.println(v);
	
	v.get(2);
	System.out.println(v.get(2));
	System.out.println(v.size());
	
	
	}

}
