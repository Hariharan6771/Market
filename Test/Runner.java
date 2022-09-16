package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) {
	ArrayList<Laptop>laps=new ArrayList<>();
	laps.add(new Laptop("Dell",12,800));
	laps.add(new Laptop("acer",8,1200));
	laps.add(new Laptop("lenovo",16,3000));
	
	Collections.sort(laps);
	for(Laptop l:laps) {
		System.out.println(l);
	}

	
	
	
	}

}
