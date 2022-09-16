package Day2;

public class UsedCar {
	public static void main(String[] args) {
		Car shift=new Car();
		shift.brand="shift";
		shift.colour="black";
		shift.price=200000;
		shift.tax=50000;
		shift.netprice=250000;
		System.out.println(shift.brand+" "+shift.colour+" "+shift.price+" "+shift.tax+" "+shift.netprice);
		
		
		Car toyota=new Car();
		toyota.brand="toyota";
		toyota.colour="pink";
		toyota.price=100000;
		toyota.tax=50000;
		toyota.netprice=150000;
		System.out.println(toyota.brand+" "+toyota.colour+" "+toyota.price+" "+toyota.tax+" "+toyota.netprice);
		int total=shift.price+toyota.price;
		System.out.println(total);
		
		
		
	}

}
