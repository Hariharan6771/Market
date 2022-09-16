package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LapLms {
	public static void main(String[] args) {
		ArrayList<LaptopOne>laps=new ArrayList<>();
		laps.add(new LaptopOne("Dell",8,800));
		laps.add(new LaptopOne("acer",12,1200));
		laps.add(new LaptopOne("Lenovo",16,3000));
		
		Comparator<LaptopOne> com=new Comparator<LaptopOne>() {
		public int compare(LaptopOne l1,LaptopOne l2) {	
			if(l1.getPrice()>l2.getPrice())
				return 1;
			else 
				return -1;
		}
		};
		
		Collections.sort(laps,com);
		
		for(LaptopOne k:laps) {
			System.out.println(k);
		}
		

		
	}

}
