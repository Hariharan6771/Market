package Collection2;

import java.util.HashMap;
import java.util.Iterator;

public class UseCar {
	public static void main(String[] args) {
	Car c1=new Car("Hyundai",250000,"Black","TN07CD2441",true);
	Car c2=new Car("Tata",200000,"Blue","TN07CL9805",true);
	Car c3=new Car("Maruthi",300000,"Pink","TN08CD2445",false);
	Car c4=new Car("Skoda",400000,"Yellow","TN09CD2449",false);
	HashMap<String,Car>cars=new HashMap<>();
	cars.put(c1.getNoPlate(),c1);
	cars.put(c2.getNoPlate(),c2);
	cars.put(c3.getNoPlate(),c3);
	cars.put(c4.getNoPlate(),c4);

	for(String c:cars.keySet()) {
	System.out.println(c);
	System.out.println(cars.get(c));
		
	}
	System.out.println("+++++++++++");
	for(Car m:cars.values()) {
		System.out.println(m);
	}
	System.out.println("+++++++++++++++++++++++++++++++++++++++");
	Car name=c1;
	int max=0;
	for(Car c:cars.values()) {
	if(c.getPrice()>max) {
    max=c.getPrice();
	name=c;
	}
	}
	System.out.println(name);
	
	}
	//Iterator<Car> m =cars.values().iterator();
	//while(m.hasNext()) {
		//if(m.next().getPrice()>300000) {
	    //m.remove();
		//}
	//}
	//System.out.println(cars);
			
		//}
	}
	
	

	
	


