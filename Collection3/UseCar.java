package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String[] args) {
	Car c1=new Car("Boleno",250000,"white",5);
	Car c2=new Car("Hyundai",300000,"Black",4);
	Car c3=new Car("Maruthi",150000,"Pink",2);
	Car c4=new Car("Benz",450000,"Yellow",5);
	ArrayList<Car>c=new ArrayList<>();
	c.add(c1);
	c.add(c2);
	c.add(c3);
	c.add(c4);
	System.out.println(c);
	List<Car>m=c.stream().filter(x->x.getPrice()>200000).collect(Collectors.toList());
	m.forEach(y->System.out.println(y));
	System.out.println("+++++++++++++++++++++");
	for(Car d:c) {
	System.out.println(d);
	System.out.println("+++++++++++++++++++++");
	List<Car>z=c.stream().filter(x->x.getBrand().startsWith("B")).collect(Collectors.toList());
	z.forEach(y->System.out.println(y));
	System.out.println("+++++++++++++++++++++");
    c.stream().filter(x->x.getColor().equalsIgnoreCase("White")).forEach(y->System.out.println(y));
    //c.stream().allMatch).forEach(z->System.out.println(z));
	}

	}

}
