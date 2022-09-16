package Collections1;

import java.util.ArrayList;

public class FruitsLamda {
	public static void main(String[] args) {
		ArrayList<String> f=new ArrayList<>();
		f.add("Banana");
		f.add("Grapes");
		f.add("Apple");
		f.add("Mango");
		System.out.println(f);
		
		f.forEach((a)->System.out.println(a));
		f.forEach((ab)->
		{
	    if(ab.length()>5) {
	    System.out.println(ab+" "+"Having more length");
	    }
	    else {
	    System.out.println(ab+" "+"length is below 5");
	    }
		}
		);
	    }
		
			
		
	}



