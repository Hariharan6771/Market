package day4;

public class UsedBike {
	public static void main(String[] args) {
		String[] bike1=args[0].split(",");
		Bike p1=new Bike();
		p1.brand=bike1[0];
		p1.price=Integer.parseInt(bike1[1]);
		p1.taxpercentage=Integer.parseInt(bike1[2]);
		p1.discountpercentage=Integer.parseInt(bike1[3]);
		p1.netprice=(p1.price+(p1.price*p1.taxpercentage/100)-(p1.price*(p1.discountpercentage/100)));
		System.out.println("Brand="+p1.brand.toUpperCase()+" "+"Price="+p1.price+" "+"Netprice="+p1.netprice);
		
		
		
		String[] bike2=args[1].split(",");
		Bike p2=new Bike();
		p2.brand=bike2[0];
		p2.price=Integer.parseInt(bike2[1]);
		p2.taxpercentage=Integer.parseInt(bike2[2]);
		p2.discountpercentage=Integer.parseInt(bike2[3]);
		p2.netprice=(p2.price+(p2.price*p2.taxpercentage/100)-(p2.price*(p2.discountpercentage/100)));
		System.out.println("Brand="+p2.brand.toUpperCase()+" "+"Price="+p2.price+" "+"Netprice="+p2.netprice);
		

		
		
				
	
		
	}

}
