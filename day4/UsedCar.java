package day4;

public class UsedCar {
	public static void main(String[] args) {
		String[] car1=args[0].split(",");
		Car bmw=new Car();
		bmw.brand=car1[0];
		bmw.price=Integer.parseInt(car1[1]);
		bmw.tax=Integer.parseInt(car1[2]);
		bmw.discount=Integer.parseInt(car1[3]);
		bmw.netprice=bmw.price+bmw.tax-bmw.discount;
		System.out.println("Brand="+bmw.brand+" "+"Price="+bmw.price+" "+"tax="+bmw.tax+" "+"Discount="+bmw.discount+" "+"Netprice="+bmw.netprice);
		  
		
		String [] car2=args[1].split(",");
		Car audi=new Car();
		audi.brand=car2[0];
		audi.price=Integer.parseInt(car2[1]);
		audi.tax=Integer.parseInt(car2[2]);
		audi.discount=Integer.parseInt(car2[3]);
		audi.netprice=audi.price+audi.tax-audi.discount;
		System.out.println("Brand="+audi.brand+" "+"Price="+audi.price+" "+"tax="+audi.tax+" "+"Discount="+audi.discount+" "+"Netprice="+audi.netprice);
		  

		
		
		
	
		
	}

}
