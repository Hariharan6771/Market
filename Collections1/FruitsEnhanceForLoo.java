package Collections1;

import java.util.ArrayList;

public class FruitsEnhanceForLoo {
	public static void main(String[] args) {
		ArrayList<String> f=new ArrayList<>();
		f.add("Banana");
		f.add("Grapes");
		f.add("Apple");
		f.add("Mango");
		System.out.println(f);
		
		for(String str:f) {
		System.out.println(str);
	    if(str.contains("pp")) {
	    System.out.println(str+" "+"Contains pp");
	    }
	    else {
	    System.out.println(str+" "+"Not Contains pp");
	    }
		}
		}


}
