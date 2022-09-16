package Collections1;

import java.util.ArrayList;

public class UseCar {
	public static void main(String[] args) {
	Car c1=new Car("Hyundai",25000,"Black",5);
	Car c2=new Car("Toyato",30000,"White",4);
	Car c3=new Car("Tat",40000,"white",5);
	Car c4=new Car("Boleno",50000,"White",2);
	Car c5=new Car("Maruthi",75000,"White",3);
	
	ArrayList<Car>abc=new ArrayList<>();
	abc.add(c1);
	abc.add(c2);
	abc.add(c3);
	abc.add(c4);
	abc.add(c5);
	ArrayList<Car>ac=new ArrayList<>();

	for(int i=0;i<abc.size();i++) {
		if(abc.get(i).getBrand().length()%2==0 && abc.get(i).getColor().equalsIgnoreCase("White")) {
	    ac.add(abc.get(i));
		}
		
	}
	
			
	System.out.println(ac);


	}

}
