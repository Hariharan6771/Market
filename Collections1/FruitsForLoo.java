package Collections1;

import java.util.ArrayList;

public class FruitsForLoo {
	public static void main(String[] args) {
		ArrayList<String> f=new ArrayList<>();
		f.add("Banana");
		f.add("Grapes");
		f.add("Apple");
		f.add("Mango");
		System.out.println(f);
        for(int i=0;i<f.size();i++) {
        System.out.println(f.get(i));
        }

	}

}
